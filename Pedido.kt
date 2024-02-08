class Pedido(val numero: Int = ++contPedidos,var platos: MutableList<Plato>,var estado: String = "pendiente") {
    companion object {
        var contPedidos = 0
    }
    fun agregarPlato(plato: Plato) {
        platos.add(plato)
    }
    fun eliminarPlato(nombrePlato: String) {
        platos.removeIf { it.nombre == nombrePlato }
    }
    fun calcularPrecio(): Double {
        return platos.sumByDouble { it.precio }
    }
    fun calcularTiempo(): Int {
        return platos.sumBy { it.tiempoPreparacion }
    }
    override fun toString(): String {
        return "Pedido #$numero - Estado: $estado\n${platos.joinToString("\n")}"
    }
}
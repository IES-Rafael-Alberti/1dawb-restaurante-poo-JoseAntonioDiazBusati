class Mesa(val numero: Int, val capacidad: Int,var estado: String = "libre",var pedidos:MutableList<Pedido>){
    fun ocuparMesa() {
        if (estado == "libre")
            estado = "ocupada"
    }
    fun ocuparReserva() {
        if (estado == "reservada")
            estado = "ocupada"
    }
    fun liberarMesa() {
        estado = "libre"
    }
    fun agregarPedido(pedido: Pedido) {
        pedidos.add(pedido)
    }
}
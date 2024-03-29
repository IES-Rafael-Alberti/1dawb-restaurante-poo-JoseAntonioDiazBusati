class Plato(var nombre:String, var precio:Double,var tiempoPreparacion:Int,val ingredientes:MutableList<String>) {
    init {
        require(nombre.isNotEmpty()) {"No puede tener un nombre vacío"}
        require(precio > 0.0) {"El precio no puede ser menor o igual que 0."}
        require(tiempoPreparacion > 1) {"El tiempo de preparacion no puede ser menor que 1."}
    }
    fun agregarIngrediente(ingrediente:String){
        ingredientes.add(ingrediente)
        require(ingredientes.isNotEmpty()) {"La lista de ingredientes no puede estar vacía"}
    }
    override fun toString(): String {
        return "$nombre ($tiempoPreparacion min.) -> $precio€ $ingredientes."
    }
}
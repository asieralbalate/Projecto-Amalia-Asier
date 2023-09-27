import java.io.BufferedReader
import java.io.InputStreamReader

class Disco(codigoUnico: Int, titulo: String, autor: String, precio: Float, stock: Int){
    val codigoUnico: Int
    val titulo: String
    val autor: String
    val precio: Float
    val stock: Int
    init {
        this.codigoUnico = codigoUnico
        this.titulo = titulo
        this.autor = autor
        this.precio = precio
        this.stock = stock
    }

    fun leerDeTeclado(){
        val input = BufferedReader(InputStreamReader(System.`in`)).readLine()
    }

    override fun toString(): String {
        return "Disco(codigoUnico=$codigoUnico, titulo='$titulo', autor='$autor', precio=$precio, stock=$stock)"
    }

    fun escribeEnFichero(){

    }
}


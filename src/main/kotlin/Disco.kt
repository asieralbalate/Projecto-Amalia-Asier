import java.io.*


class Disco(codigoUnico: Int, titulo: String, autor: String, precio: Float, stock: Int) {
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

    fun leerDeTeclado() {
        val input = BufferedReader(InputStreamReader(System.`in`)).readLine()
        println("Introduce un disco o un autor: ")
    }

    override fun toString(): String {
        return "Disco(codigoUnico=$codigoUnico, titulo='$titulo', autor='$autor', precio=$precio, stock=$stock)"
    }

    fun escribeEnFichero(stream: RandomAccessFile) {
        try {
            stream.writeInt(codigoUnico)
            stream.writeUTF(titulo)
            stream.writeUTF(autor)
            stream.writeDouble(precio.toDouble())
            stream.writeInt(stock)
        } catch (e: IOException) {
            println("Error al escribir en el fichero.")
            System.exit(0)
        }
    } // fin escribeEnFichero

    fun leeDeFichero(stream: RandomAccessFile) {
        try {
            val codigoUnico = stream.readInt()
            val titulo = stream.readUTF()
            val autor = stream.readUTF()
            val precio = stream.readFloat()
            val stock = stream.readInt()
        } catch (e: IOException) {
            println("Error al leer el fichero.")
            System.exit(0)
        }
    }
}


import java.io.File
import java.io.FileNotFoundException
import java.io.RandomAccessFile

class GestorConsultas(stream: RandomAccessFile){
    var stream: RandomAccessFile

     fun creaFichero(nombreFichero: String) {
        try {
            val exists = File(nombreFichero).exists()
            stream = RandomAccessFile(nombreFichero, "rw")
            if (!exists) {
                creaDiscosPorDefecto()
            }
        } catch (e: FileNotFoundException) {
            println("Error al abrir el fichero: $nombreFichero")
            System.exit(0)
        }
    }

    private fun creaDiscosPorDefecto() {
        val disco1 = Disco(1, "Que voy a hacer", "Los Planetas", 20.0.toFloat(), 5)
        disco1.escribeEnFichero(stream)
        val disco2 = Disco(2, "La voz del presidente", "Viva Suecia", 35.0.toFloat(), 1)
        disco2.escribeEnFichero(stream)
        val disco3 = Disco(3, "La revolución sexual", "La casa azul", 20.0.toFloat(), 10)
        disco3.escribeEnFichero(stream)
        val disco4 = Disco(4, "Finisterre", "Vetusta Morla", 40.0.toFloat(), 5)
        disco4.escribeEnFichero(stream)
        val disco5 = Disco(5, "Paradise", "Coldplay", 35.0.toFloat(), 2)
        disco5.escribeEnFichero(stream)
    }

    init {
        this.stream = stream
    }

    fun cierraGestor(){
        stream.close()
    }

    fun buscaCodigo(){

    }

    fun listaAutores(){

    }

    fun buscaAutor(){

    }

    fun altaDisco(){

    }

    fun bajaDisco(){

    }
}
package com.example.myapplication

//fun main() {
//        val texto = "Hola mundo!"
//        val texto2 = "... Adios"
//        var texto3 = ""
//        texto3 = texto + texto2 + "\n"
//        println(texto + texto2)
//        println(texto3)
//}

fun main(vararg args: String ) {
        var cadena: String = "Buenos días"
        var parametro1 = if (args.isNotEmpty()) args[0] else "Usuario"

        println("$cadena $parametro1")
        parametro1 = "Julián"
        println("$cadena $parametro1")
}
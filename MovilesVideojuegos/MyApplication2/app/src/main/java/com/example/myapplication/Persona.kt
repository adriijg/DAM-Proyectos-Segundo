package com.example.myapplication

data class Persona (val nombre: String, val edad: Int, val mayorEdad: Boolean, val altura: Double){

    override fun toString(): String{
        return "Persona(Nombre: $nombre, Edad: )"
    }
}

fun main() {
    val num1:String = "1"
    val num2:String = "2.2"
    val num3:Int = 5

    var suma: Double = 0.0
    suma = num1.toInt() + num2.toDouble() + num3
    println("La suma es $suma")
}
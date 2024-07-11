package com.example.proyectofinalmodulojava


fun main (){

    println("ingresa un nomero")

    val diaSemana = readln().toInt()

    //val peso = readln().toDouble()

    when (diaSemana){
        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("martes")
        4 -> println("martes")
        5 -> println("martes")
        else -> println("fin de semana")
    }

    if (diaSemana == 1){
        println("que triste")
    }
    else {
        println("echale ganas")
    }
}

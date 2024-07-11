package com.example.proyectofinalmodulojava

fun main (){
    println("ingresa tu peso")
    val peso = readln().toDouble()

    println("ingresa tu altura")
    val altura = readln().toDouble()

    val multi = (altura * altura)
    println(" la multiplicacion de la altura es $multi")
    val IMC = ( multi / peso)

    println(IMC)

    if (IMC < 1.8){
        println("se feliz")
    }
    else {
        println("Cuida tu consumo de papitas")
    }

}
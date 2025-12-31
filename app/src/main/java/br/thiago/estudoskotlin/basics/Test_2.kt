package br.thiago.estudoskotlin.basics

fun main() {
    val seconds = readln().toInt()
    val horas = seconds/3600
    val secondsForMinutes = seconds % 3600
    val minutes = secondsForMinutes / 60
    val leftSeconds = secondsForMinutes % 60
    println("$horas : $minutes :  $leftSeconds")
}
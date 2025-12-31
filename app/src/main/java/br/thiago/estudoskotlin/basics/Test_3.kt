package br.thiago.estudoskotlin.basics

fun main() {
   //Collections
    val family = listOf("Thiago","Ana","Max","Nick")
    val person = family[3]
    println(person)


    val daysOfMonths = listOf(
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31
    )
    println("Enter index of month: ")
    val index = readln().toInt()
    if (index < 1 || index > 12) println("Invalid index") else  println(daysOfMonths[index - 1])

}
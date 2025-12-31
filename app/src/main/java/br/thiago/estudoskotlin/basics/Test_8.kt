package br.thiago.estudoskotlin.basics

fun main() {
 /*
    do {
  //code runs even once
    }
        while (condition){
        //Execute the code
    }*/
    val secretNumber = 7
    var guess : Int

    var count = 5
    do {
        println("Guess the secret number between 1 and 10")
        guess = readln().toInt()
        if (guess < secretNumber){
            println("Too low")
        }else{
            println("Too high")
        }
    }while ( guess != secretNumber)
    println("Correct: $secretNumber")


}
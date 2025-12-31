package br.thiago.estudoskotlin.basics

fun main() {
//    while (condition){
//        //Execute the code
//    }

    var count = 5
    while (count > 0) {
        println("Count: $count")
        count--
    }

    val totalFileSize = 100
    var downloadSpeed = 15
    var downloadedSize = 0
    while (downloadedSize < totalFileSize) {
        println("Downloaded $downloadedSize/$totalFileSize Mb")
        downloadedSize += downloadSpeed
        Thread.sleep(500)
    }
    println("Download...(100/100) Mb")
    println("Download completed")

    val secretNumber = 7
    var guess : Int
    println("Guess the secret number between 1 and 10")
    guess = readln().toInt()
    while (guess != secretNumber){
      if (guess < secretNumber){
          println("Too low")
      }else{
          println("Too high")
      }
        println("Guess again")
        guess = readln().toInt()
      }
        println("Correct: $secretNumber")
    }






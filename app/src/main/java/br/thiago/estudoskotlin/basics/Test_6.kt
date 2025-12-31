package br.thiago.estudoskotlin.basics

fun main() {


    println("Grading Student 1")
    println("Grading Student 2")
    println("Grading Student 3")
    println("Grading Student 4")
    println("Grading Student 5")
    println("Grading Student 6")

    //For variable in range
    println("For variable in range")
    for (i in 1..6) {
        println("Grading Student $i")
    }
    //Print only even number
    for (i in 2..10 step 2){
        println(i)

    }
    //counting down
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    println("Happy new Year")
    for (student in 1 ..10){
        val score = student * 10  + 30
        if(score >= 50){
            println("Student $student passed with score $score")
        }else{
            println("Student $student failed with score $score")
        }
    }

    //
    for (i in 1..10){
        for(j in 1 .. 5){
            println("$i $j")
        }
        println("-----------------")
    }

    println("---break---")
    for (i in 1..10){
        if(i == 5){
            break
        }
        println(i)

    }
    println("---continue---")

    for (i in 1..10){
        if(i == 5) {
            continue

        }
        println(i)
    }

}

//1:35

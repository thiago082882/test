package br.thiago.estudoskotlin.basics

fun main() {
    //Collections
    val score1 = 85
    val score2 = 20
    val score3 = 70
    val score4 = 95
    val score5 = 6

    val scores = arrayOf(85, 20, 70, 95, 6)
    for (i in scores.withIndex()) {
        println("Index: ${i.index} Score: ${i.value}")
    }
    scores[2] = 75
    println(scores[2])

    //List
    val shoppList = listOf("Apples", "Milk", "Bread", "Apples")
    println(shoppList)
    println("The first item ${shoppList[0]}")
    println("-------------------------------------------")
    val myTasks = mutableListOf("Apples", "Milk", "Bread", "Apples")
    myTasks.add("Coffee")
    println(myTasks)




    println(classifyTemperature(-1))

    val vistorsToday = mutableSetOf<String>()

    vistorsToday.add("Thiago")
    vistorsToday.add("Ana")
    vistorsToday.add("Max")
    vistorsToday.add("Nick")
    vistorsToday.add("Thiago")
    println(vistorsToday)
    vistorsToday.remove("Nick")
    println(vistorsToday)

    val userProfile = mapOf(
    "name" to "Thiago"
        ,"age" to 25
    )
    println(userProfile)
    println(userProfile["name"])
    println(userProfile["age"])


    val userProfileMutable = mutableMapOf(
        "name" to "Thiago"
        ,"age" to 25
    )
    userProfileMutable["age"] = 26
    println(userProfileMutable)
for (
    entry in userProfileMutable
) {
    println(
        "${entry.key}: ${entry.value}"
    )


}

    verifyInput("thiago")

    calculateFactorial(5)

    findIndex(
        arrayOf("Thiago","Ana","Max","Nick"),
        "Thiago"
    )
    getCapital("França")

    val score = listOf(85, 20, 70, 95, 100)
    val maxScore = findMaxScore(score)
    println("O maior score é $maxScore")

}
fun classifyTemperature(temp: Int): String {
    return when (temp) {
        in Int.MIN_VALUE until 0 -> "Congelamento"
        in 0..15 -> "Frio"
        in 16..30 -> "Quente"
        else -> "Quente"
    }
}


fun  verifyInput(input : String?){
    val inputNameOrEmpty= input?.uppercase() ?: "DEFAULT"
    println(inputNameOrEmpty)

}

fun calculateFactorial(n: Int): Long {
    var result: Long = 1
    var counter = n

    while (counter > 0) {
      // result *= counter
        result = result * counter
        counter --
    }
    println("O fatorial de $n é $result")
    return result
}

/*
Escreva uma função chamada findIndex que receba dois argumentos: um array de itens do tipo String e um elemento alvo do tipo String.

Percorra o array. Se encontrar o elemento, retorne seu índice (posição).

Se o elemento não existir na matriz, retorne -1.
 */

//fun findIndex ( itens : Array <String>, elemento : String ): Int {
//    for ((index,item) in itens.withIndex()){
//        if (item == elemento){
//            println("O elemento $elemento está na posição $index")
//            return index
//        }
//    }
//    println("O elemento $elemento não foi encontrado")
//    return - 1
//
//}

fun findIndex(items: Array<String>, element: String): Int {
    for (i in items.indices) {
        if (items[i] == element) {
            println("O elemento $element está na posição $i")
            return i
        }
    }
    println("O elemento $element não foi encontrado")
    return -1
}

/*Escreva uma função `getCapital` que receba um país do tipo String.
Dentro da função, crie um Mapa (imutável ou mutável) com os seguintes dados:

"França" -> "Paris"

"Alemanha" -> "Berlim"

"Japão" -> "Tóquio"

 */


fun getCapital(country: String): String {

    val capitalMap = mapOf(
        "França" to "Paris",
        "Alemanha" to "Berlim",
        "Japão" to "Tóquio"
    )
    println("O capital do $country é ${capitalMap[country]}")
    return capitalMap[country] ?: ""
}


/*
Escreva uma função `findMaxScore` que aceite uma lista de números inteiros chamados `scores`.

Utilize um laço de repetição para percorrer a lista e retornar o maior número encontrado.

(Não utilize a função .maxOrNull() integrada — escreva a lógica manualmente usando um loop).
 */

//fun findMaxScore(scores: List<Int>): Int {
//    var max = 0
//    for (score in scores) {
//        if (score > max) {
//            max = score
//        }
//    }
//
//    return max
//}

//OR

fun findMaxScore(scores: List<Int>): Int {
    var max = scores[0] // Supondo que a lista não esteja vazia para este exercício.
    for (score in scores) {
        if (score > max) {
            max = score
        }
    }
    return max
}
package br.thiago.estudoskotlin.basics

fun main() {
    //String templates
    val message = "Hello Kotlin"
    println("Length: ${message.length}")
    println("uppercase: ${message.uppercase()}")
    println("Lowercase: ${message.lowercase()}")
    println("first five letters: ${message.substring(0, 5)}")
    println("does it contain 'Kotlin': ${message.contains(other = "Kotlin")}")

    //Multi line String
    val poem = """
        Roses are red,
        Violets are blue,
        Sugar is sweet,
        And so are you.
    """.trimIndent()
    println(poem)


}
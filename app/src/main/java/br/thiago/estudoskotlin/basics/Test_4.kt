package br.thiago.estudoskotlin.basics

fun main() {


    var middleName : String? = "Thiago"
    println(middleName)


    //Method 1
    if(middleName != null){
        println(middleName.uppercase())
    }else{
        println("No value for this variable")
    }
    //Method 2
    val uppercaseMiddleName = middleName?.uppercase()
    println(uppercaseMiddleName)

    //Method 3
    val upperCaseMiddleNameOrEmpty= middleName?.uppercase() ?: "No value for this variable"
    println(upperCaseMiddleNameOrEmpty)

    //Method 4
    val upperCaseNullAssertion = middleName!!.uppercase()
    println(upperCaseNullAssertion)






}
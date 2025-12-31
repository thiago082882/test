package br.thiago.estudoskotlin.basics

fun main() {
    val contacts =  mutableListOf<String>()
    var userChoice : String


    do {
        println("--- Simple Contacts Book ---")
        println("1. View all contacts")
        println("2. Add new contact")
        println("3. Exit")

        println("Enter your choice 1,2 or 3")
        userChoice = readln()


        when(userChoice){
            "1" -> {
                println("Enter contact name")
               if(contacts.isEmpty()){
               println("Your contact book is empty")

                }else{
                    for ((index,contact) in contacts.withIndex()){
                        println("${index + 1}. $contact")

                    }
               }

            }
            "2" -> {
                println("Enter contact name")
                val name= readln()

                println("Enter contact number")
                val number = readln()
               if (name.isBlank() || number.isBlank()){
                   println("Name and number cannot be blank")
               }else{
                   val newContact = "$name - $number"
                   contacts.add(newContact)
                   println("Contact added")
               }
            }
            "3" -> {
                println("Exiting the program")


               }




            }


        }while (userChoice != "3")
        println("Bye Bye")
    }
//2:05
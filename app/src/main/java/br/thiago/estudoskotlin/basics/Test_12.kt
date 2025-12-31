package br.thiago.estudoskotlin.basics

fun main() {

    val userProfile = mapOf(
        "name" to "Thiago"
        ,"age" to 25,
        "city" to "São Paulo",
        "email" to "william.paterson@my-own-personal-domain.com",
        "phone" to "123456789"
    )
    println(userProfile)

    val userName = userProfile["age"]
    println(userName)

    val studentsGrades = mutableMapOf(
        "Math" to 85,
        "English" to 90,
        "Science" to 75
    )
    studentsGrades["Math"] = 95
    println(studentsGrades)
    studentsGrades["History"] = 80
    println(studentsGrades)

for ((subject,grade) in studentsGrades){
    println("$subject: $grade")

}

}
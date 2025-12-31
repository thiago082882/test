package br.thiago.estudoskotlin.advanced.oop

fun main() {
    Students("Thiago", 25)
    Students("Ana", 20, "B")
    Students("Max", 22, "C")
    Students("Nick", 21, "D")
    Students("Lucas", 15, "A")

}
class Students(
    val name: String,
    val age: Int,
    val score :Int = 0
) {

    var grade :String = ""

    constructor(name: String,age: Int,grade:String) : this(name, 18) {
     this.grade
    }
    init {
        println("Student $name is $age years old")
        if(age < 0){
            println("Invalid age")
        }

    }
}

//3:00
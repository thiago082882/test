package br.thiago.estudoskotlin.advanced.oop

fun main() {




    val student1 = Student("Thiago", 25, "A")
    val student2 = Student("Ana", 20, "B")
    val student3 = Student("Max", 22, "C")
    val student4 = Student("Nick", 21, "D")
    val student5 = Student("Lucas", 15, "A")

    student1.displayInfo()
    student2.displayInfo()
    student3.displayInfo()
    student4.displayInfo()
    student5.displayInfo()


}

class Student(
    val name: String,
    val age: Int,
    val grade: String
){
    fun displayInfo(){
        println("Name: $name, Age: $age, Grade: $grade")

    }
}
package br.thiago.estudoskotlin.advanced.oop

open class  Person(val name: String, val age: Int){
    open fun greet(){
        println("Hello, my name is $name and I am $age years old")
    }

}

class  StudentI(name: String, age: Int, val grade : String) : Person(name, age){
    fun study(){
        println("I am studying $grade")
    }
    fun greeting(){
        println("Hello, my name is $name and I am $age years old")
    }
    override fun greet(){
        super.greet()
        println("Hello, my name is $name and I am $age years old and I am studying $grade")
    }


}


fun main() {
    val student = StudentI("Amanda",20,"A")
    student.greet()
    student.study()


}
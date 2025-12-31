package br.thiago.estudoskotlin.advanced.oop


abstract class PersonA(val name: String){
   abstract fun introduce()

    fun greeting() {
    println("Hello, my name is $name")
}


}

abstract class  HumanBeing(){

}
class  StudentA(  name: String, val grade: String) : PersonA(name){
    override fun introduce() {

        println("Hi I'm $name, a student with grade $grade")
    }


}
class  TeacherA(name: String,val subject: String) : PersonA(name){

    override fun introduce(){
        println("Hi I'm $name, a teacher with subject $subject")
    }

}

fun main() {
    val persons : List<PersonA> = listOf(
        StudentA("Thiago","A"),
        TeacherA("Amanda","Math"),
        StudentA("Max","B"),
        TeacherA("Nick","History")
    )
    for (person in persons){
        person.introduce()

    }


}


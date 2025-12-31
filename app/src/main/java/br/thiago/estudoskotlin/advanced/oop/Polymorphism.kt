package br.thiago.estudoskotlin.advanced.oop

import javax.security.auth.Subject

open class PersonT(val name: String){
    open fun introduce(){

        println("Hi I'm $name, a person")
    }

}
class  StudentT(  name: String, val grade: String) : PersonT(name){

    override fun introduce(){
        println("Hi I'm $name, a student with grade $grade")
    }



}
class  Teacher(name: String,val subject: String) : PersonT(name){

    override fun introduce(){
        println("Hi I'm $name, a teacher with subject $subject")
    }

}

fun main() {
    val persons : List<PersonT> = listOf(
        StudentT("Thiago","A"),
        Teacher("Amanda","Math"),
        StudentT("Max","B"),
        Teacher("Nick","History")
    )
    for (person in persons){
        person.introduce()

    }


}
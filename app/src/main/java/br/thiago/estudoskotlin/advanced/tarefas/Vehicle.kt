package br.thiago.estudoskotlin.advanced.tarefas

 open class Vehicle {

     open fun  drive() :String{
        return "Dirigindo..."
    }
}

class Car : Vehicle() {
    override fun drive(): String {
        return "Dirigindo um carro"

    }

}

fun testDrive(): String {
    val myCar = Car()
    return myCar.drive()
}
fun main() {
   println(testDrive())
}
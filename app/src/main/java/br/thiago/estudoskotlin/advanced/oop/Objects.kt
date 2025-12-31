package br.thiago.estudoskotlin.advanced.oop

object  BankUtils{
    fun generateAccountNumber(prefix:String,id:Int):String {
        return "$prefix-${id.toString().padStart(4,'0')}"

    }
}
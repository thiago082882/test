package br.thiago.estudoskotlin.advanced.tarefas

/*
Crie uma classe chamada BankAccount.

Deveria ter um construtor principal com uma propriedade: balance (Double).

Crie uma função dentro da classe chamada deposit(amount: Double). Essa função deve adicionar o valor ao saldo.

Crie uma função chamada withdraw(amount: Double). Essa função deve subtrair o valor do saldo.
 */

fun main() {
    val account = BankAccount(100.0)
    account.deposit(50.0)
    println(account.balance)
    account.withdraw(20.0)
    println(account.balance)


}
class BankAccount(var balance: Double) {

    fun deposit(amount :Double){
        balance = balance + amount
    }

    fun withdraw(amount: Double){
        balance = balance -  amount
    }


}
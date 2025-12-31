package br.thiago.estudoskotlin.advanced.oop

fun main() {
    val account = BankAccount()
    account.balance = 100.0
     val account2 = BankAccountE(
         balance = 800.0
     )
    account2.deposit(100.0)
    account2.withdraw(50.0)
    account2.checkBalance()
    account2.withdraw(300.0)
    account2.checkBalance()
    account2.accountName = "Thiago"
    println(account2.accountName)
    println(account2.formattedBalance)





}

class BankAccount{
    var balance = 0.0


}
class BankAccountE(
    private var balance: Double
) {
    var accountName = ""
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }else{
                println("Invalid name")
            }

        }

    val formattedBalance  : String
        get() = "$" + String.format("%.2f", balance)
    fun deposit(amount : Double){
        if (amount > 0){
            balance += amount
            println("Deposited :$amount, New balance: $balance")

        }else{
            println("Invalid amount")

        }
    }
    fun withdraw(amount: Double){
        if (amount <= balance){
            balance -= amount
            println("Withdrew: $amount, New balance: $balance")
        }else{
            println("Insufficient funds")
        }

        }
    fun checkBalance(){
        println("Current balance: $balance")

    }

}
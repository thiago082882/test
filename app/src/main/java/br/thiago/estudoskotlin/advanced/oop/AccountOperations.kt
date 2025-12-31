package br.thiago.estudoskotlin.advanced.oop

interface AccountOperations {

    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun checkBalance()
}

interface BankAccountI{


}

class SavingsAccount(private var balance: Double) : AccountOperations, BankAccountI {
    override fun deposit(amount: Double) {
        balance += amount
        println("Deposited: $amount, New balance: $balance")
    }

    override fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrew: $amount, New balance: $balance")

        } else {
            println("Insufficient funds")
        }
    }

    override fun checkBalance() {
        println("Current balance: $balance")

    }

}


class CurrentAccount(
    private var balance: Double,
    private val overdraftLimit: Double = 600.00
) :
    AccountOperations {
    override fun deposit(amount: Double) {
        balance += amount
        println("Deposited: $amount, New balance: $balance")
    }

    override fun withdraw(amount: Double) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount
            println("Withdrew: $amount, New balance: $balance")


        } else {
            println("Insufficient funds")
        }

    }

    override fun checkBalance() {
        println("Current balance: $balance")


    }

}


fun main() {
    val savingsAccount : AccountOperations = SavingsAccount(1000.00)
    val currentAccount : AccountOperations = CurrentAccount(600.00)
    savingsAccount.deposit(100.0)
    savingsAccount.withdraw(50.0)

    currentAccount.deposit(200.0)
    currentAccount.withdraw(150.0)

   println("------------Account Balance")
    savingsAccount.checkBalance()

    currentAccount.checkBalance()
}





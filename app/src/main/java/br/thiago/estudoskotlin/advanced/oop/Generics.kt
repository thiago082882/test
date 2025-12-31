package br.thiago.estudoskotlin.advanced.oop

class BankVault<T>(private var item: T) {

    companion object{
        private  var totalAccounts = 0
        fun registerBankAccount(): Int{
            totalAccounts++
            return totalAccounts
        }
    }
    fun getItem(): T {
        return item
    }

    fun updateItem(newItem: T) {
        item = newItem
        println("Vault updated with new item: $item")

    }

}

fun <T> printItem(item: T) {
    println("item: $item")

}

fun <T: AccountOperations> showAccountDetails(account: T){
    account.checkBalance()
}
fun main() {
    val moneyVault = BankVault<Double>(1000.0)
    moneyVault.updateItem(2500.0)
    val accountNumber1 = BankUtils.generateAccountNumber("Acc",5)
    println(accountNumber1)


    val s = SavingsAccount(200.0)
    val c = CurrentAccount(1000.0)
    showAccountDetails(s)
    showAccountDetails(c)

    val documentVault = BankVault<String>("Land title")
    documentVault.updateItem("Property certificate")

    println("Money vault contains ${moneyVault.getItem()}")
    println("Document vault contains ${documentVault.getItem()}")

    printItem(500)
    printItem("Hello")

    BankVault.registerBankAccount()


}
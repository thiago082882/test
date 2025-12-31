package br.thiago.estudoskotlin.basics

fun main() {


    val subTotal = 44.50
    val taxRate = 0.08


    val calculatedTax = calculateTax(subTotal,taxRate)
    val calculatedTip = calculateTip(subTotal)
    printTheBill(subTotal,calculatedTax,calculatedTip)


}

//calculate tax

fun calculateTax(billAmount : Double,taxRate : Double): Double =  billAmount * taxRate


fun calculateTip(billAmount : Double): Double{
    val tipPercent : Double
    if(billAmount > 50.0){
        tipPercent = 0.2
        }else{
        tipPercent = 0.18
    }
    return billAmount * tipPercent
}

fun printTheBill(subTotal : Double, taxAmount : Double, tipAmount : Double){
    val totalBill = subTotal + taxAmount + tipAmount

    println("-----------------Your Restaurant Bill---------------------------")
    println("Subtotal: 	${"%.2f.".format(subTotal)}")
    println("Tax: 	${"%.2f.".format(taxAmount)}")
    println("Tip: 	${"%.2f.".format(tipAmount)}")
    println("-----------------------------------------------------------------")
    println("Grand Total: 	${"%.2f.".format(totalBill)}")



}

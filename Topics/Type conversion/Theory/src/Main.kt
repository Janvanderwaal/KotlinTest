package machine

fun main() {

    var AvailableCups: Int

    println("Write how many ml of water the coffee machine has:")
    val InputmlWater : Int = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val InputmlMilk : Int = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val InputgrBeans : Int = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val InputAmountOfCups: Int = readln().toInt()

    if ((InputmlWater / 200) < (InputmlMilk / 50) && (InputmlWater / 200) < (InputgrBeans / 15) ){
        AvailableCups = (InputmlWater / 200)
    }
    else if ((InputmlMilk / 50) < (InputgrBeans / 15)) {
        AvailableCups = InputmlMilk / 50
    }
    else{
        AvailableCups = InputgrBeans / 15
    }

    if (AvailableCups < InputAmountOfCups){
        println("No, I can make only $AvailableCups cups of coffee")
    }
    else if (AvailableCups == InputAmountOfCups ){
        println("Yes, I can make that amount of coffee")
    }
    else {
        println("Yes, I can make that amount of coffee (and even ${AvailableCups - InputAmountOfCups } more than that)")
    }




}
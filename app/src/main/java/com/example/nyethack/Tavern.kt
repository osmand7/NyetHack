package com.example.nyethack
const val TAVERN_NAME = "Taernyl's Folly"
fun main() {
placeOrder("shandy,Dragon's Breath,5.91")
//    placeOrder("elixir,Shirley's Temple,4.12")
}
private fun toDragonSpeak(phrase:String)=
    phrase.replace(Regex("[AEIOUaeiou]")){
        when(it.value){
            "A","a" -> "4"
            "E","e" -> "3"
            "I","i" -> "1"
            "O","o" -> "0"
            "U","u" -> "|_|"
            else -> it.value
        }
    }

private fun placeOrder(menuDate: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")

    val (type,name,price) = menuDate.split(',')
    //delimiters界定分隔符號，用,分隔menuDate
    val message = "Madrigal buys a $name ($type) for $price"
    println(message)

    val phrase = if(name == "Dragon's Breath"){
        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name")}"
    }else{
        "Madrigal says: Thanks for the $name."
    }
    println(phrase)
}


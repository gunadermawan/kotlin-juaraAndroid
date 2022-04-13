package com.gunder.juaraAndroid.diceRoller

fun main() {
    val firstDice = Dice(6)
    println("Your ${firstDice.roll()} sided dice rolled ${firstDice.roll()}!")

    val secondDice = Dice(20)
    println("Your ${secondDice.roll()} sided dice rolled ${secondDice.roll()}!")
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
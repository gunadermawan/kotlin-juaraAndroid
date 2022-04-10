package com.gunder.juaraAndroid.basicKotlinOne

fun main() {
    val age = 22
    val layers = 5
    val name = "Bro"
    printBorder("`-._,-'", 4)
    println("happy birthday, $name!")
    printBorder("`-._,-'", 4)
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    println("")
    println("you are $age!")
    println("$age is very best age to celebrate!")
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

package com.example.calculator

fun main() {
    val calc = Calculator()
    val addOperation = AddOperation()
    println("1 더하기 2 결과는: ${calc.addOperation(addOperation, 1, 2)} 입니다")
}
package com.example.calculator

class Calculator {
    fun addOperation(addOperation: AddOperation, a: Int, b: Int): Int {
        return addOperation.execute(a, b)
    }
}
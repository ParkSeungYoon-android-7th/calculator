//package com.example.calculator
//
//fun main() {
//
//    val result =
//
//        println("처음 숫자를 입력하세요 : ")
//    var num = readLine()!!.toInt()
//
//    while (result != null) {
//
//        print("사칙연산을 입력하세여(+, -, *, /, %): ")
//        val operator = readLine()
//
//        print("다음 숫자를 입력하세여: ")
//        var num1 = readLine()!!.toInt()
//
//
//        val result = when (operator) {
//            "+" -> num + num1
//            "-" -> num - num1
//            "*" -> num * num1
//            "/" -> num / num1
//            "%" -> num % num1
//            else -> null
//        }
//        if (result != null) {
//            println("결과 : $result")
//            continue
//
//        } else {
//            println("잘못된 사칙연산 입니다. 사칙연산을 입력해주세요")
//            break
//
//        }
//        return
//    }
//}
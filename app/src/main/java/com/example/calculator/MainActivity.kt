//package com.example.calculator
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//fun main() {
//
//
//    print("처음 숫자를 입력하세여: ")
//    var num = readLine()!!.toInt()
//
//    print("사칙연산을 입력하세여(+, -, *, /, %): ")
//    val operator = readLine()
//
//    print("다음 숫자를 입력하세여: ")
//    var num1 = readLine()!!.toInt()
//
//
//    val result = when (operator) {
//        "+" -> num + num1
//        "-" -> num - num1
//        "*" -> num * num1
//        "/" -> num / num1
//        "%" -> num % num1
//        else -> null
//    }
//    if (result != null) {
//        println("결과 : $result")
//    }
//    else  {
//        println("잘못된 사칙연산 입니다. 사칙연산을 입력해주세요")
//
//    }
//
//
//
//    var bloom = arrayOf(result != null)
//
//        for (info in bloom) {
//
//            if (info !== null) {
//                println("다음 숫자를 입력하세여: ")
//
//
//            }  else if (info == null) {
//                println("잘못된 사칙연산 입니다. 사칙연산을 입력해주세요")
//
//            }
//        }
//
//    }
//
//
//
//

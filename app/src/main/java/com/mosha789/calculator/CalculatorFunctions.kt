package com.mosha789.calculator

class CalculatorFunctions {

    // Basic calculator operations
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }

    // Example of button definitions
    enum class CalculatorButton(val label: String) {
        ADD("+"),
        SUBTRACT("-"),
        MULTIPLY("*"),
        DIVIDE("/"),
        EQUALS("="),
        CLEAR("C")
    }
}
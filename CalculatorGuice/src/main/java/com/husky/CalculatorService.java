package com.husky;

class CalculatorService implements Action {
    public int calculate(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("You can't divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Incorrect operator: " + operator);
        }
    }
}

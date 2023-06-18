package com.husky;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CalculatorModule());
        CalculatorService calculatorService = injector.getInstance(CalculatorService.class);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        int result = calculatorService.calculate(firstNumber, secondNumber, operator);
        System.out.println("Result: " + result);
    }
}

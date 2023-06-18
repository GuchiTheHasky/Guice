package com.husky;

import com.husky.action.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input operation (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        Action action = null;
        switch (operator) {
            case "+":
                action = context.getBean("plus", Action.class);
                break;
            case "-":
                action = context.getBean("minus", Action.class);
                break;
            case "*":
                action = context.getBean("multiply", Action.class);
                break;
            case "/":
                action = context.getBean("divide", Action.class);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        action.execute(firstNumber, secondNumber);
    }
}


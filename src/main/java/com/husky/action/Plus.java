package com.husky.action;

import org.springframework.stereotype.Component;

@Component
public class Plus implements Action {

    public void calculate(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println("Result: " + result);
    }
}

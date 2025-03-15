package com.example;

public class App {

    public static void main(String[] args) {
        var context = "happy world";

        System.out.println(new BaseExpression().interpret(context));
    }

}

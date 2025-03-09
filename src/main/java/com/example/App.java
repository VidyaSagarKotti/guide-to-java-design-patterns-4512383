package com.example;

public class App {

    public static void main(String[] args) {
        var circle = new Circle(new Blue());
        circle.getColor();
        circle.getType();

        var square = new Square(new Red());
        square.getColor();
        square.getType();
        
    }

}

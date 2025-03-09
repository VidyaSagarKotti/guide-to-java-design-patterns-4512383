package com.example;

public class Garden {

    public static void main(String[] args) {

        var sunflower1 = FlowerFactory.getFlower("Sunflower");
        var sunflower2 = FlowerFactory.getFlower("Sunflower");
        var sunflower3 = FlowerFactory.getFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.getFlower("Rose");
        var rose2 = FlowerFactory.getFlower("Rose");
        var rose3 = FlowerFactory.getFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);

    }

}

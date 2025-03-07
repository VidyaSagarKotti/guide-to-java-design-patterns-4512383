package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface redUserInterface = createUserInterface("RED");
        UserInterface blueUserInterface = createUserInterface("BLUE");

        System.out.println(redUserInterface);
        System.out.println(blueUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        UserInterfaceFactory uiFactory = UserInterfaceFactoryMaker.getUserInterfaceFactory(color);
        return new UserInterface(uiFactory.getButton(), uiFactory.getScrollBar());
    }

}


package com.company;

public class Subject {
    public void callTheme(){
        System.out.println("The theme:");
    }
}
class Math extends Subject{
    @Override
    public void callTheme() {
        super.callTheme();
        System.out.print("Math - Factorial \n");
    }
}
class Geography extends Subject{
    @Override
    public void callTheme() {
        super.callTheme();
        System.out.println("Geography - Middle Asia");
    }
}
class Biology extends Subject{
    @Override
    public void callTheme() {
        super.callTheme();
        System.out.println("Biology - Human body");
    }
}


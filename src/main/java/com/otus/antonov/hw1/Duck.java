package com.otus.antonov.hw1;

public class Duck extends Animal implements Flying {
    @Override
    public String say(){
        return "Кря";
    }
    public String Fly() {
        return "Я лечу";
    }
}

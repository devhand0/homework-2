package com.otus.antonov.hw1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.OR;

public class Animal {
    public String name;
    public int age;
    public String color;
    public float weight;


    public String say(){
        return "Я говорю";
    }
    public String go(){
        return "Я иду";
    }
    public String drink(){
        return "Я пью";
    }
    public String eat(){
        return "Я ем";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 ? -age : age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Animal() {
        super();
    }
    @Override
    public String toString(){
        int ageLastNumber = age % 10;
        String old = "";
        String result = "";
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (isExclusion)
            old = "лет";
        result = ("Привет! меня зовут " + getName() + " , мне " + getAge() + " " + old + ", я вешу - " + getWeight() + " кг, мой цвет - " + getColor());
        //        String result = "";
//        if (age == 0 | age > 4) {
//            result = ("Привет! меня зовут " + getName() + " , мне " + getAge() + " лет, я вешу - " + getWeight() + " кг, мой цвет - " + getColor());
//        }
//        if (age == 1) {
//            result = ("Привет! меня зовут " + getName() + " , мне " + getAge() + " год, я вешу - " + getWeight() + " кг, мой цвет - " + getColor());
//        }
//        else  {
//            result = ("Привет! меня зовут " + getName() + " , мне " + getAge() + " года, я вешу - " + getWeight() + " кг, мой цвет - " + getColor());
//        }
        return result;

    }

}

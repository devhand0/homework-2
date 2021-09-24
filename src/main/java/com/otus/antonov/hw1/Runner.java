package com.otus.antonov.hw1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.otus.antonov.hw1.MyMenu.add;
import static com.otus.antonov.hw1.MyMenu.list;
import static com.otus.antonov.hw1.MyMenu.exit;



public class Runner {
    public static void main(String[] args) {
        ArrayList Animals = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String menuIn = "";
                while (!menuIn.equals("exit")) {
            System.out.println("Меню");
            System.out.println("Введите add для добовления");
            System.out.println("Введите list для печати списка");
            System.out.println("Введите exit для выхода");
            menuIn = scan.nextLine().trim().toLowerCase();
            if (MyMenu.add.name().equals(menuIn)) {
                System.out.println("adding");
                Scanner sc = new Scanner(System.in);
                System.out.println("какое животное?(cat/dog/duck)");
                String type = sc.nextLine();
                System.out.println("Name?");
                String nameIn = sc.nextLine();
                System.out.println("age?");
                int ageIn = Integer.parseInt(sc.nextLine());
                System.out.println("weight?");
                int weightIn = Integer.parseInt(sc.nextLine());
                System.out.println("color?");
                String colorIn = sc.nextLine();
                    if (type.equals("dog")){
                        Dog dog = new Dog();
                        dog.setName(nameIn);
                        dog.setAge(ageIn);
                        dog.setColor(colorIn);
                        dog.setWeight(weightIn);
                        Animals.add(dog);
                        String say = dog.say();
                        System.out.println(say);
                }   else if (type.equals("cat")){
                        Cat cat = new Cat();
                        cat.setName(nameIn);
                        cat.setAge(ageIn);
                        cat.setColor(colorIn);
                        cat.setWeight(weightIn);
                        Animals.add(cat);
                        String say = cat.say();
                        System.out.println(say);
                    }else if (type.equals("duck")){
                        Duck duck = new Duck();
                        duck.setName(nameIn);
                        duck.setAge(ageIn);
                        duck.setColor(colorIn);
                        duck.setWeight(weightIn);
                        Animals.add(duck);
                        String say = duck.say();
                        System.out.println(say);
                    } else {
                        System.out.println("Wrong type error");
                    }

            }    else if (MyMenu.list.name().equals(menuIn)) {
                System.out.println("listing");
                for (int i = 0; i < Animals.size(); i++){
                System.out.println(Animals.get(i));}
            } else if (MyMenu.exit.name().equals(menuIn)) {
                System.out.println("выход");
                break;
            } else {
                System.out.println("error");
            }
        }
        System.out.println("exit prog");
    }
}

package com.company;

public class Dog {
    String name;
    int age;
    String color;


    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        if (age<0) {
            System.out.println("False age");
        }
        else
        this.age=age;
    }
    void setColor(String color){
        this.color=color;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getColor(){
        return color;
    }
    void method(String name, int age, String color){
        System.out.println("About a Dog:    "+"Name:"+name+";   age: "+age+";   color: "+color);
    }
}

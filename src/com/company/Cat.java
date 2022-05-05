package com.company;

public class Cat {
    String name;
    int age;
    String color;

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
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void method(String name,int age,String color){
        System.out.println("About a cat:   "+"Name:"+name+";   age:" +age
                +"; color:"+color);

    }
}

package com.company;

public class Fish {
    private String name;
    private int price;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    void method(String name, int price,String type){
        System.out.println("About a fish:   "+"Name:"+name+";   price:" +price
        +"; type:"+type);
    }
}

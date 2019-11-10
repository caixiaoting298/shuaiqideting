package com.google.reading;

public class Textbook implements Reading {
    int price,pages;
    String applicable_object;
    public Textbook(int pages,int price,String applicable_object) {
        this.pages = pages;
        this.price = price;
        this.applicable_object = applicable_object;
    }
    //实现接口方法Info（）
    public void Info() {
        System.out.println("This is a textbook,which has " + pages + " pages," + "costs " + price + " yuan,and applicable for " + applicable_object + ".");
    }
}

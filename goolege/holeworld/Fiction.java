package com.google.reading;

public class Fiction implements Reading {
    private String applicable_object;
    int price,pages;
    //Fiction类构造方法
    public Fiction(int pages,int price,String applicable_object) {
        this.pages = pages;
        this.price = price;
        this.applicable_object = applicable_object;
    }
    //实现接口方法Info（）
    public void Info() {
        System.out.println("This is a fiction,which has " + pages + " pages,"+" costs " + price + " yuan,and applicable for " + applicable_object +".");
    }
}

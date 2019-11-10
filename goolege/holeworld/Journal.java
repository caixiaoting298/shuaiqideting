package com.google.reading;

public class Journal implements Reading {
    int price,pages;
    String publishing_time;
    public Journal(int pages,int price,String publishing_time) {
        this.pages = pages;
        this.price = price;
        this.publishing_time = publishing_time;
    }
    //实现接口方法Info（）
    public void Info() {
        System.out.println("This is a Journal,which has " + pages + " pages," +"costs " + price +" yuan,and publish once every "+publishing_time+".");
    }
}

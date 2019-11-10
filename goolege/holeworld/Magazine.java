package com.google.reading;

import javax.swing.*;

public class Magazine implements Reading {
    int price,pages;
    String publish_time;
    public Magazine(int i,int j,String publish_time) {
        this.pages = pages;
        this.price = price;
        this.publish_time = publish_time;
    }
    //实现接口方法Info（）
    public void Info() {
        System.out.println("This is a magazine,which has " + pages + " pages," + "costs " + price +" yuan,and publish once every " + publish_time + ".");
    }
}

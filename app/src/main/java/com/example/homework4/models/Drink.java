package com.example.homework4.models;

/*
//Homework 2
//Khaled Mohamed Ali and Joseph Mauney
 */

import java.io.Serializable;

public class Drink implements Serializable {
    int size1, alcoholPercentage;
    String date;

    public Drink(int size, int alcoholPercentage, String date) {
        this.size1 = size;
        this.alcoholPercentage = alcoholPercentage;
        this.date = date;
    }

    public int getSize1() {
        return size1;
    }

    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size1=" + size1 +
                ", alcoholPercentage=" + alcoholPercentage +
                ", date='" + date + '\'' +
                '}';
    }
}

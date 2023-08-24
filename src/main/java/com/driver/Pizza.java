package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;
        this.bill = String.valueOf(this.price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.bill = String.valueOf(Integer.parseInt(this.bill)+80);
    }

    public void addExtraToppings(){
        // your code goes here
        this.bill = String.valueOf(Integer.parseInt(this.bill)+(isVeg==true?70:120));
    }

    public void addTakeaway(){
        // your code goes here
        this.bill = String.valueOf(Integer.parseInt(this.bill)+20);
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}

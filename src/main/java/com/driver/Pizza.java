package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheese = false;
    private boolean isTopping = false;
    private boolean isAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.isCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.isTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.isAway = true;
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza:"+this.getPrice());
        if(this.isVeg)
        {
            if(this.isCheese)
            {
                this.price+=80;
                System.out.println("Extra Cheese Added:"+80);
            }
            if(this.isTopping)
            {
                System.out.println("Extra Toppings Added:"+70);
                this.price+=70;
            }
            if(this.isAway)
            {
                System.out.println("Paperbag Added:"+20);
                this.price+=20;
            }
        }
        else
        {
            if(this.isCheese)
            {
                this.price+=80;
                System.out.println("Extra Cheese Added:"+80);
            }
            if(this.isTopping)
            {
                System.out.println("Extra Toppings Added:"+120);
                this.price+=120;
            }
            if(this.isAway)
            {
                System.out.println("Paperbag Added:"+20);
                this.price+=20;
            }
        }
        return "Total Price:"+this.price;
    }
}

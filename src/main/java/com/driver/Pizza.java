package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean isCheese = false;
    private boolean isTopping = false;
    private boolean isAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;
//        this.bill+="";
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
        bill+="Base Price Of The Pizza:"+this.getPrice()+"\n";
        if(this.isVeg)
        {
            if(this.isCheese)
            {
                this.price+=80;
                bill+="Extra Cheese Added:80\n";
            }
            if(this.isTopping)
            {
                bill+="Extra Toppings Added:70\n";
                this.price+=70;
            }
            if(this.isAway)
            {
                bill+="Paperbag Added:20\n";
                this.price+=20;
            }
        }
        else
        {
            if(this.isCheese)
            {
                this.price+=80;
                bill+="Extra Cheese Added:80\n";
            }
            if(this.isTopping)
            {
                bill+="Extra Toppings Added:120\n";
                this.price+=70;
            }
            if(this.isAway)
            {
                bill+="Paperbag Added:20\n";
                this.price+=20;
            }
        }
        bill+="Total Price:"+this.price+"\n";
        return bill;
    }
}

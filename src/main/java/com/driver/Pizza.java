package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean wantExtraCheese;
    boolean wantExtraToppings;
    boolean TakeAway;
    boolean BillCreated;

    private int Toppings;
    private int cheese;
    private int base;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        wantExtraCheese = false;
        wantExtraToppings = false;
        TakeAway = false;
        BillCreated =false;
        this.bill ="";

        if(isVeg==true){
            this.price = 300;
            this.Toppings =70;
        }
        else{
            this.price = 400;
            this.Toppings =120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: " + this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!wantExtraCheese){
            this.price += this.cheese;
            wantExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!wantExtraToppings){
            this.price += this.Toppings;
            wantExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!TakeAway){
            this.price += 20;
            TakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!BillCreated){
            if(wantExtraCheese){
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if(wantExtraToppings){
                this.bill += "Extra Toppings Added: " + this.Toppings + "\n";
            }
            if(TakeAway){
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            this.BillCreated = true;
        }
        return this.bill;
    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean cheeseAdded;
    boolean toppigsAdded;
    boolean paperBag;
    boolean billGenerated;
    int toppingPrice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            this.price += 80;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppigsAdded){
            this.price += toppingPrice;
            toppigsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag){
            this.price += 20;
            paperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGenerated){
            if(cheeseAdded){
                this.bill += "Extra Cheese Added: 80"+"\n";
            }
            if(toppigsAdded){
                this.bill += "Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(paperBag){
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: "+this.price;
            billGenerated = true;
            return this.bill;
        }
        return this.bill;
    }
}

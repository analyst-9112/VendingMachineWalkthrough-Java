//This is the package that the class Gum sits in.
package com.codedifferently.walkthrough.vendingmachine.inventory;

//This states that Gum is a public class and that it extends the Product class.
public class Gum extends Product{

//This is the constructor for the Gum class. Super is used because it has to call the parent class.
    public Gum(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Chew Chew, Yum!";
    }

    public Gum(){
        this("Rhino Chew", 0.0);
    }

    @Override
    public String message() {
        return msg;
    }
}

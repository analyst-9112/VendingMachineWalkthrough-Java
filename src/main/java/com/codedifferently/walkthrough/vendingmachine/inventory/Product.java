//This is the package that the class Product is nested in.
package com.codedifferently.walkthrough.vendingmachine.inventory;

//This creates the abstract class Products. The class is abstract because of the specific instructions
// that are given to the Product class.
public abstract class Product {

//This scope has a private reference called name that returns a String, and a private reference called price
//that returns a Double. Also a protected reference called msg that returns a String.
    private String name;
    private Double price;
    protected String msg;

//This is the Constructor for the Products class. It states that each product made must have a name and a price.
    public Product(String name, Double priceIn){
        this.name = name;
        this.price = priceIn;
    }

//This creates the method getName which is of type String, and returns a name.
    public String getName(){
        return name;
    }

//This creates the method getPrice which is of type Double, and returns a price.
    public Double getPrice(){
        return price;
    }


//This creates a String of the returns values for name and price. This helps when running the test since
//the excepted is "Big Red 0.25", this puts the return values in the proper format.
    @Override
    public String toString(){
        return name + " " + price;
    }

    public abstract String message();
}

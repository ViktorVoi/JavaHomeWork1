package com.pb.voitovych.hw7;

public abstract class Clothes {

    private String name ;
    private Size size ;
    private double price ;
    private String color ;

    public Clothes(String name, Size size, double price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

}

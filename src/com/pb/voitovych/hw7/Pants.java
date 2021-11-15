package com.pb.voitovych.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(String name, Size size, double price, String color) {
        super(name, size, price, color);
    }
}

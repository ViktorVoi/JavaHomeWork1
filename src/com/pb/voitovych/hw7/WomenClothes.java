package com.pb.voitovych.hw7;

public interface WomenClothes {

    default void dressWomen() {
        Clothes one = (Clothes) this ;
        System.out.println("для жінки - назва: " + one.getName()
                + ", розмір: " + one.getSize() + " euro: " + one.getSize().getEuroSize() +
                " (" + one.getSize().getDescription() + ")"
                + ", ватрість: " + one.getPrice()
                + ", колір: " + one.getColor());
    }
}

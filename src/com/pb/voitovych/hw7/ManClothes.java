package com.pb.voitovych.hw7;

public interface ManClothes {
    default void dressMan() {
        Clothes one = (Clothes) this ;
        System.out.println("для чоловіка - назва: " + one.getName()
                + ", розмір: " + one.getSize() + " euro: " + one.getSize().getEuroSize() +
                        " (" + one.getSize().getDescription() + ")"
                + ", ватрість: " + one.getPrice()
                + ", колір: " + one.getColor());
        }
}

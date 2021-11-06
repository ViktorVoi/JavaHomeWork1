package com.pb.voitovych.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String eyes ;

     public Cat(String nickName, String eyes) {
        super(nickName, "рибку", "на килимку");
        this.eyes = eyes;
     }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("\"Мяу-мяу!\"");
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println(", а очі "+getEyes()+"!");
    }

    public String getEyes() {
        return eyes;
    }

    @Override
    public String toString() {
        return  "Котяра \n" +
                "Кличка: " + this.getNickName() + "\n" +
                "Любить ласувати: " + this.getFood() + "\n" +
                "Спить: " + this.getLocation() + "\n" +
                "Має очі: " + this.getEyes() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(eyes, cat.eyes) && (this.getNickName() == cat.getNickName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNickName(), eyes);
    }

}

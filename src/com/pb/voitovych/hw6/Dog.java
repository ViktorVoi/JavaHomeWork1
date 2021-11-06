package com.pb.voitovych.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String tail ;

    public Dog(String nickName, String tail) {

        super(nickName, "cосиску", "в будці") ;
        this.tail =tail ;
    }


    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("\"Гав-гав!\"");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" (любить це сильно, аж хвіст - "+getTail()+"!)");
    }

    public String getTail() {
        return tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(tail, dog.tail) && (this.getNickName() == dog.getNickName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNickName(), tail);
    }

    @Override
    public String toString() {
        return "Собачка \n" +
               "Кличка: " + this.getNickName() + "\n" +
               "Любить їсти: " + this.getFood() + "\n" +
               "Живе: " + this.getLocation() + "\n" +
               "Хвіст: " + this.getTail() ;
    }
}

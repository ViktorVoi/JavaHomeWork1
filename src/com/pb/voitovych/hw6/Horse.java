package com.pb.voitovych.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String color;

    public Horse(String nickName, String color) {
        super(nickName, "овес", "на лузі");
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(this.getNickName() + ", " + this.color + ", не їсть " + this.getFood()
                + " бо скаче галопом " + this.getLocation() + "!");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("\"І-і-го-го!\"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse hourse = (Horse) o;
        return Objects.equals(color, hourse.color) && (this.getNickName() == hourse.getNickName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNickName(), color);
    }

    @Override
    public String toString() {
        return  "Конячка \n" +
                "Кличка: " + this.getNickName() + "\n" +
                "Їсть: " + this.getFood() + "\n" +
                "Пасеться: " + this.getLocation() + "\n" +
                "Колір: " + this.color;
    }

}


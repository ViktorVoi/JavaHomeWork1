package com.pb.voitovych.hw6;

public class Animal {

        // private static String whoIm ;
    private String nickName ;
    private String food ;
    private String location ;

    public Animal(String nickName, String food, String location) {
        // this.whoIm = "тваринка" ;
        this.nickName = nickName ;
        this.food = food ;
        this.location = location ;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.print(getNickName() +" каже: ");
    }

    public void eat() {
        System.out.print(getNickName()+" зараз їсть "+getFood());
    }

    public void sleep() {
        System.out.println(getNickName()+" зараз спить...");
    }

}


package com.pb.voitovych.hw6;

public class Veterinarian {
    private String nameDoctor ;

    public Veterinarian(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public void treatAnimal(Animal animal) {

        System.out.println("Картка хворого");
        System.out.println("--------------");
        System.out.println(animal.toString());
        System.out.println("-------------- огляд завершено");

    }



}

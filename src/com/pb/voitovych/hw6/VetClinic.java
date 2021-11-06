package com.pb.voitovych.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetClinic {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Dog dog1 = new Dog("Сірко", "пістолєтом") ;
        Dog dog2 = new Dog("Найда", "без хвоста") ;

    // перевірка наслідування та полімофірзму
        dog1.makeNoise();
        dog2.eat();
        dog1.eat() ;
        dog1.sleep();

        Cat cat1 = new Cat("Баюн", "хитрющі") ;
        cat1.makeNoise();
        cat1.eat();
        cat1.sleep();

        Horse horse1 = new Horse("Гобунок", "в яблуках") ;
        horse1.eat();
        horse1.makeNoise();
        horse1.sleep();

    // перевірки перевизначених toString(), equals(), hashCode()
        System.out.println("перевірки перевизначених toString(), equals(), hashCode()");
        System.out.println(dog1.toString());
        System.out.println("---");
        System.out.println(dog2.toString());
        System.out.println("-----");
        System.out.println(cat1.toString());
        System.out.println("-----");
        System.out.println(horse1.toString());
        System.out.println("---");
        //
        Dog dog3 = new Dog("Сірко", "пістолєтом") ; // the same as dog1
        System.out.println("equals(dog1, dog2): " + dog1.equals(dog2) );
        System.out.println("equals(dog1, dog3): " + dog1.equals(dog3) );
        System.out.println("hashCode(): ");
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println("---");
    // -- відправка до ветеринару
        Animal[] animals = {(Animal) dog1, (Animal) dog2, (Animal) cat1, (Animal) horse1} ;

        // -- рефлексія

        Class vetClazz = Class.forName("com.pb.voitovych.hw6.Veterinarian") ;

        Constructor constr = vetClazz.getConstructor(new Class[] {String.class}) ;

        Object doctor = constr.newInstance("Ай-болить") ;

        if (doctor instanceof Veterinarian) {
            for (Animal oneAnimal : animals) {
                ((Veterinarian) doctor).treatAnimal(oneAnimal);
            }
        } else {
            System.out.println("рефлексія не працює");
        }

        System.out.println("---------------------");

    }
}

package com.DuyenNguyen.SealedClasses;

public class PetApp {

    public static void watchWalkable(Walkable walkable){
        switch (walkable){
            case Dogs dog -> dog.bark();
            case Cats cat -> cat.meow();
            default -> System.out.println("Other animal");
        }
        walkable.walk();
    }

    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cats cat = new Cats();

        watchWalkable(dog);
        watchWalkable(cat);
    }
}

package com.DuyenNguyen.SealedClasses;

/**
 * sealed class: add-on with inheritance
 * restriction (limit what classes are allowed to inherit from it)
 */
public sealed class Animals implements Walkable
        permits Dogs, Cats {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void grow() {
        this.age = getAge()+1;
    }

}

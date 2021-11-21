package com.DuyenNguyen.SealedClasses;

/**
 * non-sealed class: no need subclass
 */

public non-sealed class Dogs extends Animals {

    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void bark() {
        System.out.println("Gau gau");
    }
}

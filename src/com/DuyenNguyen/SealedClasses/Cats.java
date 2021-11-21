package com.DuyenNguyen.SealedClasses;

/**
 * final class: cannot be inherited from it
 */
public final class Cats extends Animals {
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void meow() {
        System.out.println("Meo meo");
    }
}

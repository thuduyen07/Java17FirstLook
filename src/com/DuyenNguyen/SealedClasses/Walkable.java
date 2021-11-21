package com.DuyenNguyen.SealedClasses;

public sealed interface Walkable permits Animals{

    public void walk();
}

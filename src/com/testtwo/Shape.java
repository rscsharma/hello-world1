package com.testtwo;

public interface Shape
{
    default void draw() {

        // this is a test
        System.out.println("Default draw");
    }
}

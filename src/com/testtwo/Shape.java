package com.testtwo;

public interface Shape
{
    default void draw() {
        System.out.println("Default draw");
    }
}

package com.malexj.entity.impl;

import com.malexj.entity.Shape;

public class Square implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Square::draw() method.");
    }
}

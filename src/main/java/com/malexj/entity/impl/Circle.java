package com.malexj.entity.impl;

import com.malexj.entity.Shape;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }
}

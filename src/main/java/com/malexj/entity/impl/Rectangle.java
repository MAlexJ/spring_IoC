package com.malexj.entity.impl;

import com.malexj.entity.Shape;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

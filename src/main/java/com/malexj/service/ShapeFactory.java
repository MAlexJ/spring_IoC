package com.malexj.service;

import com.malexj.entity.Shape;
import com.malexj.entity.impl.Circle;
import com.malexj.entity.impl.Rectangle;
import com.malexj.entity.impl.Square;

/**
 * Create a Factory to generate object of concrete class based on given information.
 */
public class ShapeFactory
{
    /**
     * use getShape method to get object of type shape
     */
    public Shape getShapeByType(String shapeType)
    {
        // # 1 check incoming parameter
        checkShapeType(shapeType);

        // #2 find a service by shapeType
        if (shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        throw new IllegalArgumentException("The service with the type: "+ shapeType+ "not found!");
    }

    private void checkShapeType(String shapeType)
    {
        if (shapeType == null)
        {
            throw new IllegalArgumentException("Incorrect name of shapeType");
        }
    }
}

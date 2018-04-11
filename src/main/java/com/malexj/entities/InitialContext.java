package com.malexj.entities;

import com.malexj.services.impl.Service1;
import com.malexj.services.impl.Service2;

/**
 * Create InitialContext for JNDI lookup
 * JNDI Context carries the reference to service used for lookup purpose.
 */
public class InitialContext
{
    public Object lookup(String jndiName)   // todo <<< java 8 and create test <<<<<<<<< AND create Annotation to print on start and end method
    {
        if (jndiName.equalsIgnoreCase("SERVICE1"))
        {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2"))
        {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}

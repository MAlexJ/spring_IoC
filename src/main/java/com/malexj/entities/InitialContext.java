package com.malexj.entities;

import com.malexj.services.impl.Service1;
import com.malexj.services.impl.Service2;

/**
 * Create InitialContext for JNDI lookup
 * JNDI Context carries the reference to service used for lookup purpose.
 */
public class InitialContext
{
    private static final String FIRST_SERVICE = "SERVICE1";
    private static final String SECOND_SERVICE = "SERVICE2";

    public Object lookup(String jndiName)
    {
        if (jndiName.equalsIgnoreCase(FIRST_SERVICE))
        {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase(SECOND_SERVICE))
        {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        throw new IllegalArgumentException("The service with name: " + jndiName + " not found!");
    }
}

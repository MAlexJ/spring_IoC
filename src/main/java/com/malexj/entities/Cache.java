package com.malexj.entities;

import com.malexj.services.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Cache to store references of services to reuse them
 */
public class Cache
{
    private List<Service> services;

    Cache()
    {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName)  // todo <<< java 8 and create test <<<<<<<<<
    {
        for (Service service : services)
        {
            if (service.getName().equalsIgnoreCase(serviceName))
            {
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) // todo <<< java 8 and create test <<<<<<<<<
    {
        boolean exists = false;
        for (Service service : services)
        {
            if (service.getName().equalsIgnoreCase(newService.getName()))
            {
                exists = true;
            }
        }
        if (!exists)
        {
            services.add(newService);
        }
    }
}

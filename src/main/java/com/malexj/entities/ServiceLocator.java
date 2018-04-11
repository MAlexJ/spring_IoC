package com.malexj.entities;

import com.malexj.services.Service;

/**
 * Service Locator is a single point of contact to get services by JNDI lookup caching the services.
 */
public class ServiceLocator
{
    private static Cache cache;

    // init Cache
    static
    {
        cache = new Cache();
    }

    public static Service getService(String jndiName)
    {
        // #1 find service in cache
        Service service = cache.getService(jndiName);
        if (service != null)
        {
            return service;
        }

        // #2 init a new service and add it to the cache
        InitialContext context = new InitialContext();
        Service serviceResult = (Service) context.lookup(jndiName);
        cache.addService(serviceResult);
        return serviceResult;
    }
}

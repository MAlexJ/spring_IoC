package com.malexj;

import com.malexj.entities.ServiceLocator;
import com.malexj.services.Service;

/**
 * Design Pattern - Service Locator Pattern
 * <p>
 * The service locator design pattern is used when we want to locate various services using JNDI lookup.
 * Considering high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique.
 * For the first time a service is required, Service Locator looks up in JNDI and caches the service object.
 * Further lookup or same service via Service Locator is done in its cache which improves the performance of application to great extent.
 * <p>
 * Following are the entities of this type of design pattern:
 * - Service
 * - Context / Initial Context
 * - Service Locator
 * - Cache
 * - Client
 */
public class AppDemo
{
    /**
     * Implementation
     * <p>
     * We are going to create a ServiceLocator, InitialContext, Cache, Service as various objects representing our entities.
     * Service1 and Service2 represent concrete services.
     */
    public static void main(String[] args)
    {
        // Use the ServiceLocator to demonstrate Service Locator Design Pattern.
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

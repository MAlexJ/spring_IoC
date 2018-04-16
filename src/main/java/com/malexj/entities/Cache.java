package com.malexj.entities;

import com.google.common.annotations.VisibleForTesting;
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

    public Service getService(String serviceName)
    {
        return services.stream()
                .filter(service -> service.getName().equalsIgnoreCase(serviceName))
                .findFirst()
                .orElse(null);
    }

    public void addService(Service newService)
    {
        if (!isExistsService(newService))
        {
            services.add(newService);
        }
    }

    private boolean isExistsService(Service newService)
    {
        return services.stream()
                .anyMatch(service -> service.getName().equalsIgnoreCase(newService.getName()));
    }

    /**
     * For test only
     */
    @VisibleForTesting
    protected List<Service> getServices()
    {
        return services;
    }
}

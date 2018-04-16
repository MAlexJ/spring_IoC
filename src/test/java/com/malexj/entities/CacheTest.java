package com.malexj.entities;

import com.malexj.services.Service;
import com.malexj.services.impl.Service1;
import com.malexj.services.impl.Service2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CacheTest
{
    @Test
    public void test()
    {
        assertService();
        assertServiceTwo();
    }

    private void assertServiceTwo()
    {
        Cache cache = new Cache();

        // Service 1
        Service serviceExpect = new Service1();
        cache.addService(serviceExpect);
        assertEquals(cache.getService(serviceExpect.getName()).getName(), serviceExpect.getName());

        // Service 2
        Service serviceExpectSecond = new Service2();
        cache.addService(serviceExpectSecond);
        assertEquals(cache.getService(serviceExpectSecond.getName()).getName(), serviceExpectSecond.getName());

        // check size
        List<Service> services = cache.getServices();
        assertEquals(services.size(), 2);
    }

    private void assertService()
    {
        Cache cache = new Cache();
        Service serviceExpect = new Service1();
        cache.addService(serviceExpect);
        cache.addService(serviceExpect);
        cache.addService(serviceExpect);

        Service serviceActual = cache.getService(serviceExpect.getName());
        assertEquals(serviceActual.getName(), serviceExpect.getName());

        List<Service> services = cache.getServices();
        assertEquals(services.size(), 1);
    }
}

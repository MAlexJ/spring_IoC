package com.malexj.services;

/**
 * Actual Service which will process the request.
 * Reference of such service is to be looked upon in JNDI server.
 */
public interface Service
{
    String getName();

    void execute();
}

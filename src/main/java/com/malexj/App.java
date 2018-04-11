package com.malexj;

import com.malexj.service.factory.MessageFactory;
import com.malexj.service.MessageRenderer;

/**
 * Run project
 */
public class App
{
    public static void main(String[] args)
    {
        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();
    }
}

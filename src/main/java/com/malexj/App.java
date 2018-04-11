package com.malexj;

import com.malexj.service.MessageProvider;
import com.malexj.service.MessageRenderer;
import com.malexj.service.impl.MessageProviderImpl;
import com.malexj.service.impl.MessageRendererImpl;

/**
 * Run project
 */
public class App
{
    public static void main(String[] args)
    {
        MessageProvider provider = new MessageProviderImpl();
        MessageRenderer renderer = new MessageRendererImpl(provider);
        renderer.render();
    }
}

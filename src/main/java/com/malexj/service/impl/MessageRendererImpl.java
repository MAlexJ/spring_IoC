package com.malexj.service.impl;

import com.malexj.service.MessageProvider;
import com.malexj.service.MessageRenderer;

public class MessageRendererImpl implements MessageRenderer
{
    private final MessageProvider provider;

    public MessageRendererImpl(MessageProvider provider)
    {
        this.provider = provider;
    }

    public void render()
    {
        String message = provider.getMessage();
        System.out.println("message: " + message);
    }
}

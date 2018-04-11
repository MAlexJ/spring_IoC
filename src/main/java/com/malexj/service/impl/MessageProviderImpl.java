package com.malexj.service.impl;

import com.malexj.service.MessageProvider;

public class MessageProviderImpl implements MessageProvider
{
    public String getMessage()
    {
        return "Hello ! >>> " + MessageProvider.class.getName();
    }
}

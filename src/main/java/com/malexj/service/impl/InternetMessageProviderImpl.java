package com.malexj.service.impl;

import com.malexj.service.MessageProvider;

public class InternetMessageProviderImpl implements MessageProvider
{
    @Override
    public String getMessage()
    {
        return "www.google.com >>>>>" + InternetMessageProviderImpl.class.getName();
    }
}

package com.malexj.service.factory;

import com.malexj.service.MessageProvider;
import com.malexj.service.MessageRenderer;
import lombok.Getter;

import java.io.InputStream;
import java.util.Properties;

@Getter
public class MessageFactory
{
    @Getter
    private static MessageRenderer renderer;
    private static MessageProvider provider;

    static
    {
        try (InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties"))
        {
            Properties properties = new Properties();
            properties.load(in);

            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRendererClass = properties.getProperty("messageRendererClass");

            provider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (MessageRenderer) Class.forName(messageRendererClass).getConstructor(MessageProvider.class).newInstance(provider);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

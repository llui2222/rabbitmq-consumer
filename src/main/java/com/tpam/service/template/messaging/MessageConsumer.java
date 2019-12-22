/*
package com.tpam.service.template.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

@EnableBinding(MessageSink.class)
public class MessageConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);


    @StreamListener(
        target = MessageSink.INPUT)
    public void onMessageReceived(@Payload TestMessage payload, @Headers Map<String, Object> headers) {
        logger.info("Received message {} with headers {}", payload, headers);

    }

}
*/

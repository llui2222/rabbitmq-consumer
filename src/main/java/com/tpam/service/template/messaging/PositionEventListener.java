/*
package com.tpam.service.template.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

@EnableBinding(MessageSink.class)
public class PositionEventListener {
    private static final Logger logger = LoggerFactory.getLogger(PositionEventListener.class);

    @StreamListener(
        target = MessageSink.POSITION,
        condition = "headers['eventType']=='POSITION_UPDATE'")
    public void onPositionUpdate(@Payload TradeUpdate payload, @Headers Map<String, Object> headers) {
        logger.info("Received position update {}" );

    }


}
*/

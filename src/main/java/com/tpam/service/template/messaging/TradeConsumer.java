package com.tpam.service.template.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

@EnableBinding(TradeSink.class)
public class TradeConsumer {

    private static final Logger logger = LoggerFactory.getLogger(TradeConsumer.class);


    @StreamListener(
        target = TradeSink.TRADE_UPDATED_INPUT)
    public void onTradeUpdated(@Payload TestMessage payload, @Headers Map<String, Object> headers) {
        logger.info("Received trade update {} with headers {}", payload, headers);

    }

    @StreamListener(
        target = TradeSink.TRADE_CREATED_INPUT)
    public void onTradeCreated(@Payload TestMessage payload, @Headers Map<String, Object> headers) {
        logger.info("Received trade creation {} with headers {}", payload, headers);

    }

    @StreamListener(
        target = TradeSink.TRADE_FINALIZED_INPUT)
    public void onTradeFinalized(@Payload Trade payload, @Headers Map<String, Object> headers) {
        logger.info("Received trade finalized event {} with headers {}", payload, headers);

    }

}

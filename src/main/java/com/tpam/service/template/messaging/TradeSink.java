package com.tpam.service.template.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TradeSink
{
  String TRADE_UPDATED_INPUT ="tradeUpdatedInput";
  String TRADE_CREATED_INPUT ="tradeCreatedInput";
  String TRADE_FINALIZED_INPUT ="tradeFinalizedInput";



  @Input(TradeSink.TRADE_UPDATED_INPUT)
  SubscribableChannel tradeUpdatedInput();

  @Input(TradeSink.TRADE_CREATED_INPUT)
  SubscribableChannel tradeCreatedInput();

  @Input(TradeSink.TRADE_FINALIZED_INPUT)
  SubscribableChannel tradeFinalizedInput();
}

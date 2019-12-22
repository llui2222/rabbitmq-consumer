package com.tpam.service.template.messaging;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.core.style.ToStringCreator;

import java.math.BigDecimal;
import java.util.UUID;

public class Trade {

    private final UUID tradeId;
    private final String requestId;
    private final BigDecimal requestedVolume;
    private final BigDecimal requestedOpenPrice;
    private final String symbol;
    private final String side;
    private final String orderType;
    private final String timeInForce;
    private final String takerName;
    private final String takerLogin;
    private final BigDecimal volume;
    private final BigDecimal averagePrice;
    private final String cancellationReason;
    private final String status;
    private final Long version;

    @JsonCreator
    public Trade(@JsonProperty("id")final UUID tradeId,
                 @JsonProperty("requestId")final String requestId,
                 @JsonProperty("requestedVolume")final BigDecimal requestedVolume,
                 @JsonProperty("requestedOpenPrice")final BigDecimal requestedOpenPrice,
                 @JsonProperty("symbol")final String symbol,
                 @JsonProperty("side")final String side,
                 @JsonProperty("orderType")final String orderType,
                 @JsonProperty("timeInForce")final String timeInForce,
                 @JsonProperty("takerName")final String takerName,
                 @JsonProperty("takerLogin")final String takerLogin,
                 @JsonProperty("filledVolume")final BigDecimal volume,
                 @JsonProperty("averagePrice")final BigDecimal averagePrice,
                 @JsonProperty("cancellationReason")final String cancellationReason,
                 @JsonProperty("status")final String status,
                 @JsonProperty("version")final Long version) {
        this.tradeId = tradeId;
        this.requestId = requestId;
        this.requestedVolume = requestedVolume;
        this.requestedOpenPrice = requestedOpenPrice;
        this.symbol = symbol;
        this.side = side;
        this.orderType = orderType;
        this.timeInForce = timeInForce;
        this.takerName = takerName;
        this.takerLogin = takerLogin;
        this.volume = volume;
        this.averagePrice = averagePrice;
        this.cancellationReason = cancellationReason;
        this.status = status;
        this.version = version;
    }

    public UUID getTradeId() {
        return tradeId;
    }

    public String getRequestId() {
        return requestId;
    }

    public BigDecimal getRequestedVolume() {

        return requestedVolume;
    }

    public BigDecimal getRequestedOpenPrice() {

        return requestedOpenPrice;
    }

    public String getSymbol() {

        return symbol;
    }

    public String getSide() {

        return side;
    }

    public String getOrderType() {

        return orderType;
    }

    public String getTimeInForce() {

        return timeInForce;
    }

    public String getTakerLogin() {

        return takerLogin;
    }

    public String getTakerName() {

        return takerName;
    }

    public BigDecimal getVolume() {

        return volume;
    }

    public BigDecimal getAveragePrice() {

        return averagePrice;
    }

    public String getCancellationReason() {

        return cancellationReason;
    }

    public String getStatus() {

        return status;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)
            .append("requestedVolume", requestedVolume)
            .append("requestedOpenPrice", requestedOpenPrice)
            .append("symbol", symbol)
            .append("side", side)
            .append("orderType", orderType)
            .append("timeInForce", timeInForce)
            .append("takerName", takerName)
            .append("takerLogin", takerLogin)
            .append("volume", volume)
            .append("averagePrice", averagePrice)
            .append("status", status)
            .append("tradeSequenceNumber", version)
            .toString();
    }
}

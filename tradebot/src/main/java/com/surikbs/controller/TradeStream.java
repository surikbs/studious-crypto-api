package com.surikbs.controller;

import com.binance.connector.client.impl.WebsocketClientImpl;

public class TradeStream {
    private TradeStream() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.tradeStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}

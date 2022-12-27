package com.surikbs.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public final class privateconfig {
    private privateconfig(){

    }
    public static final String BASE_URL = "https://testnet.binance.vision";
    public static final String API_KEY = "";
    public static final String SECRET_KEY = ""; // Unnecessary if PRIVATE_KEY_PATH is used
    public static final String PRIVATE_KEY_PATH = ""; // Key must be PKCS#8 standard

}

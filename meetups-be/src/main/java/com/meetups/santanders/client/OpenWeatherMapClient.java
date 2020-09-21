package com.meetups.santanders.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class OpenWeatherMapClient {

    @Value("${open.weather.internalUrl}")
    private String contractsEngineInternalUrl;
    @Value("${open.weather.api.key}")
    private String apiKey;
    @Autowired
    private RestTemplate restTemplate;
}

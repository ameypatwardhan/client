package com.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("client")
public class clientcomponent { 
    private int minBalance;
    private int maxBalance;    
}
package com.eazybytes.gatewayserver.filters;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.List;

@Component
public class FilterUtility {

    public static final String CORRELATION_ID = "bankapp-correlation-id";

    public String getCorrelationId(HttpHeaders http) {
        if(http.get(CORRELATION_ID) != null) {
            List<String> requestHeadersList = http.get(CORRELATION_ID);
            return requestHeadersList.stream().findFirst().get();
        } else {
            return null;
        }
    }

    public ServerWebExchange setRequestHeader(ServerWebExchange webExchange, String name, String value) {
        return webExchange.mutate().request(webExchange.getRequest().mutate().header(name, value).build()).build();
    }

    public ServerWebExchange setCorrelationId(ServerWebExchange exchange, String correlationId) {
        return this.setRequestHeader(exchange, CORRELATION_ID, correlationId);
    }
}

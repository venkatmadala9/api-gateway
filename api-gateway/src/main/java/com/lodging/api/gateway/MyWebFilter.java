package com.lodging.api.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

//@Component
public class MyWebFilter implements WebFilter{
	
	@Autowired
	CorsFilter corsFilter;

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		exchange.getResponse().getHeaders().add("Access-Control-Allow-Headers", "*");
		return chain.filter(exchange);
	}

}

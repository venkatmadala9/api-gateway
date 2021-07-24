package com.lodging.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMoethod()
	{
		return "User service is taking longer than actual";
	}
	
	@GetMapping("/hotelServiceFallback")
	public String hotelServiceFallbackMoethod()
	{
		return "Hotel service is taking longer than actual";
	}
}

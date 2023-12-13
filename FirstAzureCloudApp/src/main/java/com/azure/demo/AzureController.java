package com.azure.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AzureController {

	@GetMapping("/get/msg")
	public String getMessageFromCloud() {
		return "This is the first Spring Boot app to Azure Cloud !";
	}

}

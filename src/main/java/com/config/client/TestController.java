package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testcon")
public class TestController {
	@GetMapping("/test/getmsg")
	@ResponseBody
	public String getMessage()
	{
		return "Hello from Apigateway";
	}
}

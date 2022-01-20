package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class ClientConfig {
	
	@Autowired
	private clientcomponent configuration;
	
	@Value("${client.minBalance}")
	private String balance;
	
	@GetMapping("/bank/getdetails")
	@ResponseBody
	public void  getDbEntries()
	{
		//List<String> list = new ArrayList<>();
		
		//list.addAll(db.getAllDbs());
		//return list;
		
		System.out.println("balance = "+balance);
	}

}

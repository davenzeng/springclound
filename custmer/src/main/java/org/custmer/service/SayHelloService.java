package org.custmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
*@类说明 
*@author davenTsang
*@since 2018年7月31日
*
**/
@Service
public class SayHelloService {

	@Autowired
	RestTemplate restTemplate;
	
	public String sayHello(String name){
		return restTemplate.getForObject("http://TEST-SERVICE/add?name="+name, String.class);
	}
	
//	@Bean
//	RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}

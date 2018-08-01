package org.custmer.controller;

import org.custmer.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类说明
 * @author davenTsang
 * @since 2018年7月31日
 *
 **/
@RestController
public class RequestCenterController {

	@Autowired      
	private SayHelloService SayHelloService;

	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return SayHelloService.sayHello(name);
	}
}

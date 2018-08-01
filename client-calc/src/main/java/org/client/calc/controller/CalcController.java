package org.client.calc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类说明
 * @author davenTsang
 * @since 2018年7月31日
 *
 **/
@RestController
public class CalcController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@RequestParam String name) {
		System.out.println("hello wolrd" + name);
		return "hello world" + name;
	}
}

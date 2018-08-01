package org.eureka.peer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * 
 * @author davenTsang
 * @since 2018年7月31日
 */
@SpringBootApplication
@EnableEurekaServer
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

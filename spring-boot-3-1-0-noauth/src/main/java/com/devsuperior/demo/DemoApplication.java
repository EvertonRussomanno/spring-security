package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

//	@Autowired
//	private PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Encode = " + passwordEncoder.encode("123456"));
//
//		boolean result = passwordEncoder.matches("123456", "$2a$10$1eAKOWC8gvkZLikw01SgvOdX4vrm7J54XlJnE1HVMSMJJc7PHufHm");
//		System.out.println("Deu match? -> " + result);
//	}
}

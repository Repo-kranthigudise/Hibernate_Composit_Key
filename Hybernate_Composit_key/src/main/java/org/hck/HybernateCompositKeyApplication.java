package org.hck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan({"org.hck.repository,org.hck.services"})
public class HybernateCompositKeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HybernateCompositKeyApplication.class, args);
	}

}

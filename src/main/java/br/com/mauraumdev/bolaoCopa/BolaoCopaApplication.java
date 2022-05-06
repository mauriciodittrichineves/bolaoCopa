package br.com.mauraumdev.bolaoCopa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BolaoCopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BolaoCopaApplication.class, args);
	}

}

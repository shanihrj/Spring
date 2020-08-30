package com.client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com")
@EnableJpaRepositories("com")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(Test.class, args);

	}

}

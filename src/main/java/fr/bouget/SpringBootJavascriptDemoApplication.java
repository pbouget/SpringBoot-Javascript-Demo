package fr.bouget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"fr.bouget"})
public class SpringBootJavascriptDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavascriptDemoApplication.class, args);
	}

}

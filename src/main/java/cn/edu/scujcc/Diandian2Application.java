package cn.edu.scujcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Diandian2Application {

	public static void main(String[] args) {
		SpringApplication.run(Diandian2Application.class, args);
	}

}

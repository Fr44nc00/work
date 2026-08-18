package br.com.francombbs.mainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MainserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainserviceApplication.class, args);
	}

}

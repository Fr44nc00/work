package br.com.francombbs.main_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// VVV Transforma o projeto num servidor próprio
@EnableEurekaServer
// VVV Ativa o config server
@EnableConfigServer
public class MainMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainMicroserviceApplication.class, args);
	}

}
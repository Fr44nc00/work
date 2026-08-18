package br.com.francombbs.server_aula_microservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerAulaMicroservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAulaMicroservicoApplication.class, args);
	}

}

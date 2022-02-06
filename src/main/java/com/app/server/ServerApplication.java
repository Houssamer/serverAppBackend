package com.app.server;

import com.app.server.enumeration.Status;
import com.app.server.model.Server;
import com.app.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,
					"192.168.1.160",
					"Ubuntu",
					"16GB",
					"Personal PC", "http://localhost:8080/server/image/server1.png",
					Status.SERVER_UP));
		};
	}
}

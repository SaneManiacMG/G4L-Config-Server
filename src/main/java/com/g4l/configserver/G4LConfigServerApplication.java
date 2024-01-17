package com.g4l.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class G4LConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(G4LConfigServerApplication.class, args);
	}

}

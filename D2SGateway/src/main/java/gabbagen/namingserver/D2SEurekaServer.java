package gabbagen.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class D2SEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(D2SEurekaServer.class, args);
	}

}

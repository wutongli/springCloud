package cn.sz.lwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCloudApplication7002 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerCloudApplication7002.class, args);
	}

}

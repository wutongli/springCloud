package cn.sz.lwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//网关
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class Zuul_9527_StartSpringCloud {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_StartSpringCloud.class, args);
	}
}

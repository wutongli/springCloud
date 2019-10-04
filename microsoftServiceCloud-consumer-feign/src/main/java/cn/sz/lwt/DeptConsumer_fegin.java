package cn.sz.lwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.sz.lwt"})//@FeignClient注解所在包
@ComponentScan("cn.sz.lwt")//@FeignClient注解所在包
public class DeptConsumer_fegin {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_fegin.class, args);
	}
}

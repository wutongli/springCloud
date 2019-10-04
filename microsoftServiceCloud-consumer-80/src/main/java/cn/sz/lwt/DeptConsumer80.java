package cn.sz.lwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import ribbon.rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//自定义负载均衡策略,这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下!
@RibbonClient(name="microsoftCloude-dept",configuration=MySelfRule.class)
public class DeptConsumer80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80.class, args);
	}
}

package cn.sz.lwt.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//ribbon负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	//指定其他负载均衡策略 ,默认轮询策略
	@Bean
	public IRule randomRule() {
		return new RandomRule();
	}
}

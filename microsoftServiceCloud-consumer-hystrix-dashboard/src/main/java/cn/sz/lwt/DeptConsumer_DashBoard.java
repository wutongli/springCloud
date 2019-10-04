package cn.sz.lwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//熔断监控
public class DeptConsumer_DashBoard {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_DashBoard.class, args);
		
	}
}

package cn.sz.lwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.sz.lwt.pojo.Dept;
import cn.sz.lwt.service.DeptClientService;

@RestController
@RequestMapping("/consumer")
@ConfigurationProperties(prefix="helloservice")
public class DeptControllerConsumer {
	/*@Autowired
	private RestTemplate restTemplate;*/
	
	@Autowired
	private DeptClientService service;
	
	//引入配置文件参数
	//private String servicepath;
	
	@RequestMapping("show/{id}")
	public Dept show(@PathVariable("id") Integer empno) {
		return service.show(empno);
	}
	
	
	/*@RequestMapping("show/{id}")
	public Dept show(@PathVariable("id") Integer empno) {
		return restTemplate.getForObject(servicepath+"dc/show/"+empno, Dept.class);
	}*/
	
	/*//调用服务发现
	public Object discovery() {
		
		return restTemplate.getForObject(servicepath+"dc/discovery", Object.class);
		
	}*/
}

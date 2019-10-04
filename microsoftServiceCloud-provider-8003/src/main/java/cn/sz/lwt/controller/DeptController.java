package cn.sz.lwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

import cn.sz.lwt.pojo.Dept;
import cn.sz.lwt.service.DeptService;
@RestController
@RequestMapping("/dc")
public class DeptController {
	@Autowired
	private DeptService serviceImpl;
	@Autowired //服务发现
	private DiscoveryClient client;
	
	@RequestMapping("show/{id}")
	public Dept show(@PathVariable("id") Integer empno) {
		return serviceImpl.queryDeptByID(empno);
	}
	//对外提供服务发现的接口
	@RequestMapping("discovery")
	public Object discovery() {
		List<InstanceInfo> instances = client.getInstancesById("microsoftCloude-dept");
		for (InstanceInfo instanceInfo : instances) {
			System.out.println(instanceInfo.getHostName());
		}
		return client.getApplications();
	}
	
}

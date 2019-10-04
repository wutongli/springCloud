package cn.sz.lwt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.sz.lwt.pojo.Dept;
import cn.sz.lwt.service.DeptService;
@RestController
@RequestMapping("/dc")
public class DeptController {
	@Autowired
	private DeptService serviceImpl;
	
	@HystrixCommand(fallbackMethod = "processHystrix_Show")
	@RequestMapping("show/{id}")
	public Dept show(@PathVariable("id") Integer empno) {
		Dept dept = serviceImpl.queryDeptByID(empno);
		if(null==dept) {
			 throw new RuntimeException("该empno："+empno+"没有没有对应的信息");
		}
		return dept;
	}
	//出现异常后自动调用该方法
	public Dept processHystrix_Show(@PathVariable("id") Integer empno)
	  {
	   return new Dept().setDeptno(empno)
	           .setDname("该ID："+empno+"没有没有对应的信息,null--@HystrixCommand")
	           .setDbSource("no this database in MySQL");
	  }

	
	
}

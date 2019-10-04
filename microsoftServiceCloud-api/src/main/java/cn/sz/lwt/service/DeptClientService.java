package cn.sz.lwt.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sz.lwt.pojo.Dept;


@FeignClient(value = "microsoftCloude-dept",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	@RequestMapping("show/{id}")
	public Dept show(@PathVariable("id") Integer empno);
}

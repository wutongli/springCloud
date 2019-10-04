package cn.sz.lwt.service;

import org.springframework.stereotype.Component;

import cn.sz.lwt.pojo.Dept;
import feign.hystrix.FallbackFactory;

@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		
		return new DeptClientService() {
		     @Override
		     public Dept show(Integer empno) {
		     
		       return new Dept().setDeptno(empno)
		               .setDname("该ID："+empno+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
		               .setDbSource("no this database in MySQL");
		     }

		};	
	}
}

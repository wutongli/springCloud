package cn.sz.lwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.lwt.mapper.DeptMapper;
import cn.sz.lwt.pojo.Dept;
import cn.sz.lwt.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper dao;
	
	public Dept queryDeptByID(Integer empno) {
		return dao.queryDeptByID(empno);
	}
}

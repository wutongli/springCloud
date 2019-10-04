package cn.sz.lwt.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.sz.lwt.pojo.Dept;
@Mapper
public interface DeptMapper {
	public Dept queryDeptByID(Integer empno);
}

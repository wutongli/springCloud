package cn.sz.lwt.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)//开启链式风格
public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String  dname;
	private String  dbSource;
	
	/*public static void main(String[] args) {
		Dept d = new Dept();
		d.setDeptno(100).setDname("ffd").setDbSource("wutong");
		System.out.println(d);
	}*/
}

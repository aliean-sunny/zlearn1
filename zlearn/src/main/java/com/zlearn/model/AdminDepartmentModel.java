/**
 * 
 */
package com.zlearn.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author ZESTECH IT
 *
 */
@Entity
@Table(name="zl_admin_department")
public class AdminDepartmentModel {
	
	@Id
	@GeneratedValue
	private Integer dept_id;
	
	private String dept_name;
	
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	

}

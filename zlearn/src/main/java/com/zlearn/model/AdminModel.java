package com.zlearn.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="zl_admin")
public class AdminModel {
	
@Id	
private Integer admin_id;



private String username;
private String email_id;
private Integer mobile_no;
private String pass;
private Integer admin_status;
private Date created_at;
private Date updated_at;
private String remarks;
private Integer dept_id;

public Integer getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(Integer admin_id) {
	this.admin_id = admin_id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public Integer getMobile_no() {
	return mobile_no;
}
public void setMobile_no(Integer mobile_no) {
	this.mobile_no = mobile_no;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public Integer getAdmin_status() {
	return admin_status;
}
public void setAdmin_status(Integer admin_status) {
	this.admin_status = admin_status;
}
public Date getCreated_at() {
	return created_at;
}
public void setCreated_at(Date created_at) {
	this.created_at = created_at;
}
public Date getUpdated_at() {
	return updated_at;
}
public void setUpdated_at(Date updated_at) {
	this.updated_at = updated_at;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public Integer getDept_id() {
	return dept_id;
}
public void setDept_id(Integer dept_id) {
	this.dept_id = dept_id;
}


}

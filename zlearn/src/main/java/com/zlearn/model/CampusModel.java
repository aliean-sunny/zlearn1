/**
 * 
 */
package com.zlearn.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ZESTECH IT
 *
 */
@Entity
@Table(name="zl_campus")
public class CampusModel {
	
	@Id
	private Integer campus_id;
	private String campus_name;
	private String campus_email;
	private Long campus_contact_no;
	private String campus_spoc;
	private Integer university_id;
	private String campus_code;
	private String campus_address;
	private Integer campus_status;
	private String added_by;
	private Date created_at;
	private Date updated_at;
	
	public Integer getCampus_id() {
		return campus_id;
	}
	public void setCampus_id(Integer campus_id) {
		this.campus_id = campus_id;
	}
	public String getCampus_name() {
		return campus_name;
	}
	public void setCampus_name(String campus_name) {
		this.campus_name = campus_name;
	}
	public String getCampus_email() {
		return campus_email;
	}
	public void setCampus_email(String campus_email) {
		this.campus_email = campus_email;
	}
	public Long getCampus_contact_no() {
		return campus_contact_no;
	}
	public void setCampus_contact_no(Long campus_contact_no) {
		this.campus_contact_no = campus_contact_no;
	}
	public String getCampus_spoc() {
		return campus_spoc;
	}
	public void setCampus_spoc(String campus_spoc) {
		this.campus_spoc = campus_spoc;
	}
	public Integer getUniversity_id() {
		return university_id;
	}
	public void setUniversity_id(Integer university_id) {
		this.university_id = university_id;
	}
	public String getCampus_code() {
		return campus_code;
	}
	public void setCampus_code(String campus_code) {
		this.campus_code = campus_code;
	}
	public String getCampus_address() {
		return campus_address;
	}
	public void setCampus_address(String campus_address) {
		this.campus_address = campus_address;
	}
	public Integer getCampus_status() {
		return campus_status;
	}
	public void setCampus_status(Integer campus_status) {
		this.campus_status = campus_status;
	}
	public String getAdded_by() {
		return added_by;
	}
	public void setAdded_by(String added_by) {
		this.added_by = added_by;
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
	

}

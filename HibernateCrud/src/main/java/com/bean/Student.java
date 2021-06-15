package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hibernate_Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "FirstName")
	private String sfname;
	@Column(name = "Password")
	private String spass;
	@Column(name = "Contact")
	private Long scontact;
	@Column(name = "Email_id")
	private String semail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	public Long getScontact() {
		return scontact;
	}
	public void setScontact(Long scontact) {
		this.scontact = scontact;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	

}

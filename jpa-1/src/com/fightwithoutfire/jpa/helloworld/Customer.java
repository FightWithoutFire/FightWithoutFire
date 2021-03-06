package com.fightwithoutfire.jpa.helloworld;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "JPA_CUSTOMERS")
public class Customer {
	private Integer id;
	private String lastName;
	private String email;
	private int age;
	
	private Date birth;
	private Date createdTime;
	
	@Temporal(TemporalType.DATE)
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	  
//	@TableGenerator(name = "ID_GENERATOR",
//			table = "jpa_id_generators",
//			pkColumnName = "PK_NAME",
//			pkColumnValue = "ORDER_ID",
//			valueColumnName = "PK_VALUE",
//			allocationSize = 11,
//			initialValue = 1)
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE,  generator = "ID_GENERATOR")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", email=" + email + ", age=" + age + ", birth="
				+ birth + ", createdTime=" + createdTime + "]";
	}
	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Transient
	public String getInfo() {
		return "";
	}
	
}

package com.cjw.pojo;

import java.util.Date;

/**
 * table name:  smbms_user
 * author name: mj
 * create time: 2019-10-31 14:55:21
 */ 
public class SmbmsUser{

	private int id;
	private String userCode;
	private String userName;
	private String userPassword;
	private Integer gender;
	private Date birthday;
	private String phone;
	private String address;
	private Long userRole;
	private Long createdBy;
	private Date creationDate;
	private Long modifyBy;
	private Date modifyDate;

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setUserCode(String userCode){
		this.userCode=userCode;
	}
	public String getUserCode(){
		return userCode;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}
	public String getUserPassword(){
		return userPassword;
	}
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public Integer getGender(){
		return gender;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	public Date getBirthday(){
		return birthday;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setUserRole(Long userRole){
		this.userRole=userRole;
	}
	public Long getUserRole(){
		return userRole;
	}
	public void setCreatedBy(Long createdBy){
		this.createdBy=createdBy;
	}
	public Long getCreatedBy(){
		return createdBy;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public Date getCreationDate(){
		return creationDate;
	}
	public void setModifyBy(Long modifyBy){
		this.modifyBy=modifyBy;
	}
	public Long getModifyBy(){
		return modifyBy;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public Date getModifyDate(){
		return modifyDate;
	}
}


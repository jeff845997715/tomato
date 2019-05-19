package com.tomato.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * user 实体类
 *
 * @author Jeff
 * @create 2019/5/12
 * @since 1.0.0
 */
@Entity(name="tb_user")
public class User implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String username;

	@Column
	private String phone;

	@Column
	private String password;

	@Column(name="login_time")
	private Date loginTime;

	@Column(name="login_number")
	private Integer loginNumber;

	@Column(name="create_time")
	private Date createTime;

	@Column(name="update_time")
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Integer getLoginNumber() {
		return loginNumber;
	}

	public void setLoginNumber(Integer loginNumber) {
		this.loginNumber = loginNumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + username + '\'' +
				", passWord='" + password + '\'' +
				", phone='" + phone + '\'' +
				", loginTime='" + loginTime + '\'' +
				", createTime='" + createTime + '\'' +
				'}';
	}
}

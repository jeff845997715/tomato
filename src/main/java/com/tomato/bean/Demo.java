package com.tomato.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * demo 实体类
 *
 * @author Jeff
 * @create 2019/5/17
 * @since 1.0.0
 */
@Entity(name="tb_demo")
public class Demo implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	@Column
	private String content;

	@Column(name="create_time")
	private Date createTime;

	@Column(name="create_user_id")
	private Integer createUserId;

	@Column(name="update_time")
	private Date updateTime;

	@Column(name="update_user_id")
	private Integer updateUserId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}
}

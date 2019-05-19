package com.tomato.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * log 实体类
 *
 * @author Jeff
 * @create 2019/5/17
 * @since 1.0.0
 */
@Entity(name="tb_log")
public class Log implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String type;

	@Column
	private String model;

	@Column(name="rel_id")
	private Integer relId;

	@Column(name="create_time")
	private Date createTime;

	@Column(name="create_user_id")
	private Integer createUserId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getRelId() {
		return relId;
	}

	public void setRelId(Integer relId) {
		this.relId = relId;
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
}

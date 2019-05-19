package com.tomato.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * menu 实体类
 *
 * @author Jeff
 * @create 2019/5/17
 * @since 1.0.0
 */
@Entity(name="tb_privs")
public class Privs implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String model;

	@Column(name="can_read")
	private Integer canRead;

	@Column(name="can_edit")
	private Integer canEdit;

	@Column(name="can_add")
	private Integer canAdd;

	@Column(name="can_export")
	private Integer canExport;

	@Column(name="create_time")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getCanRead() {
		return canRead;
	}

	public void setCanRead(Integer canRead) {
		this.canRead = canRead;
	}

	public Integer getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Integer canEdit) {
		this.canEdit = canEdit;
	}

	public Integer getCanAdd() {
		return canAdd;
	}

	public void setCanAdd(Integer canAdd) {
		this.canAdd = canAdd;
	}

	public Integer getCanExport() {
		return canExport;
	}

	public void setCanExport(Integer canExport) {
		this.canExport = canExport;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

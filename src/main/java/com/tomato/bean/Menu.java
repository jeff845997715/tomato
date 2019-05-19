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
@Entity(name="tb_menu")
public class Menu implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	@Column
	private String url;

	@Column(name="parent_id")
	private Integer parentId;

	@Column(name="create_time")
	private Date createTime;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

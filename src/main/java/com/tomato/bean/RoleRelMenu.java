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
@Entity(name="tb_role_rel_menu")
public class RoleRelMenu implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="role_id")
	private String roleId;

	@Column(name="menu_id")
	private String menuId;

	@Column(name="create_time")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

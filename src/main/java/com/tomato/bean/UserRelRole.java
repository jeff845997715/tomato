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
@Entity(name="tb_user_rel_role")
public class UserRelRole implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="role_id")
	private String roleId;

	@Column(name="user_id")
	private String userId;

	@Column(name="create_time")
	private Date createTime;
}

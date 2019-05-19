package com.tomato.repository;

import com.tomato.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User数据访问层
 *
 * @author Jeff
 * @create 2019/5/12
 * @since 1.0.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "select u from tb_user u where u.id=?1")
	public User findById(@Param("id") Integer id);

	/**
	 * jpa自动生成的sql
	 * @return
	 */
	List<User> findAll();
}

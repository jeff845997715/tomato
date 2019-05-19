package com.tomato.service;

import com.tomato.bean.User;
import com.tomato.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * User业务层
 *
 * @author Jeff
 * @create 2019/5/12
 * @since 1.0.0
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * 根据ID查用户信息
	 * @param id
	 * @return
	 */
	public User findById(Integer id) {
		return userRepository.findById(id);
	}

	public void test() {
	}
}

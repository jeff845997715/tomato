package com.tomato.controller;

import com.tomato.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * user控制层
 *
 * @author Jeff
 * @create 2019/5/18
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		// User user = userService.findById(1);
		return "admin/index/index";
	}
}

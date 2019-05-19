package com.tomato.controller;

import com.tomato.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * index控制层
 *
 * @author Jeff
 * @create 2019/5/12
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "index")
public class IndexController {
	@Resource
	private UserService userService;

	private static Logger logger = Logger.getLogger(String.valueOf(IndexController.class));

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		// User user = userService.findById(1);
		// log
		logger.info("test");
		return "admin/index/index";
	}
}

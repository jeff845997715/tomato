package com.tomato.config.interceptor;

import com.tomato.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 *
 * @author Jeff
 * @create 2019/5/18
 * @since 1.0.0
 */
@Component
public class loginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		// Session提取User来验证登陆。
		HttpSession session = request.getSession();

		// 这里的User是登陆时放入session的
		User user = (User) session.getAttribute("user");

		//如果session中没有user，表示没登陆
		if (user == null){
			//这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
			//当然你可以利用response给用户返回一些提示信息，告诉他没登陆
			response.sendRedirect(request.getContextPath()+"/index/login");
			return false;
		}else {
			//如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
		if(response.getStatus()==500){
			modelAndView.setViewName("/error/500");
		}else if(response.getStatus()==404){
			modelAndView.setViewName("/error/404");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

	}
}

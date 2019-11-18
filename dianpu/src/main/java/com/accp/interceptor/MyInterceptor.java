package com.accp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component//让spring容器创建该类对象，表示其它组建
public class MyInterceptor implements HandlerInterceptor{

	/***
	 * 
	 * 执行控制器之前执行该方法，返回false表示不执行控制器
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("preHandler");
		/**
		 * 是否白名单，不管是否登录都可以看到，loginIn register
		 */
		/**
		 * 
		 * 登录后才能看到的
		 */
		return true;
	}
}

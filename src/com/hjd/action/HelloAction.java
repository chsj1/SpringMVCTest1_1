package com.hjd.action;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloAction implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/*
		 * ModelAndView:向视图传递数据与路径
		 */
		ModelAndView modelAndView = new ModelAndView();
		//传递数据
		modelAndView.addObject("message", "这是我的第一个springmvc程序");
		//指定路径
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}
}

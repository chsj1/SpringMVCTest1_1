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
		 * ModelAndView:����ͼ����������·��
		 */
		ModelAndView modelAndView = new ModelAndView();
		//��������
		modelAndView.addObject("message", "�����ҵĵ�һ��springmvc����");
		//ָ��·��
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}
}

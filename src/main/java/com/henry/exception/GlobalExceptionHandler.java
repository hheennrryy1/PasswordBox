package com.henry.exception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	public static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * Ӧ�õ�����@RequestMappingע��ķ����������׳�Exceptionʱִ��
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleException(Exception e) {
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("exception", e);
		logger.info("exception", e);
		return mav;
	}
}

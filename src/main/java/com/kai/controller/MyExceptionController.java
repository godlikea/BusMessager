package com.kai.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;
/**
 * 全局异常处理
 * @author Administrator
 *
 */
@ControllerAdvice
@Slf4j
public class MyExceptionController {

	@ResponseBody
	@ExceptionHandler(Exception.class)
	public Object errorException(Exception e) {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("code", 400);
		jsonObject.put("msg","程序异常");
		log.error(e.getMessage());
		return jsonObject;
	}
}

package com.kai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
/**
 * 应用通用接口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/appSet")
public class AppController {
	
	@RequestMapping("/myInfo")
	public Object getInfo() throws Exception{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "张三");
		jsonObject.put("myTeamCount", 10);
		jsonObject.put("teamName", "北京市驻郑州市分部");
		jsonObject.put("address", "榆林南路241号");
		int i=1/0;
		return jsonObject;
	}
	
	@RequestMapping("/myTeam")
	public Object getTeam(String id) throws Exception{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "张三的团队");
		jsonObject.put("myTeamCount", 20);
		jsonObject.put("price", "234.6万");
		jsonObject.put("address", "榆林南路241号");
		return jsonObject;
	}

}

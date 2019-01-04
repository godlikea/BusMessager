package com.kai.gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kai.annotation.Manage;
import com.kai.domain.UserEntity;

public class GsonTest {
	
	@Test
	public void gsonTest() throws Exception {
		GsonBuilder gsonBuilder=new GsonBuilder().serializeNulls();
		Gson gson = gsonBuilder.create();
		UserEntity user=new UserEntity();
		user.setAge(10);
		//user.setName("叫我测试");
		Class<? extends UserEntity> clazz = user.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields) {
			if(field.isAnnotationPresent(Manage.class)) {
				Manage ann = field.getAnnotation(Manage.class);
				//注解属性值
				String value = ann.value();
				String name = field.getName();
				Method method = clazz.getMethod("set"+name.substring(0, 1).toUpperCase()+name.substring(1), value.getClass());
				method.invoke(user, value);
			}
		}
		String json = gson.toJson(user);
		System.out.println(json);
		UserEntity fromJson = gson.fromJson(json, UserEntity.class);
		System.out.println(fromJson);
	}
}

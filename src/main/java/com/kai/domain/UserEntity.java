package com.kai.domain;

import com.google.gson.annotations.SerializedName;
import com.kai.annotation.Manage;

import lombok.Data;

@Data
public class UserEntity {
	
	@SerializedName("1231321")
	private String id;
	
	@Manage("小时定")
	private String name;
	
	private Integer age;
}

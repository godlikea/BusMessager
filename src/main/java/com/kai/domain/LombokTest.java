package com.kai.domain;

import org.junit.jupiter.api.Test;

public class LombokTest {
	
	@Test
	public void UserTest() {
		UserEntity ue=new UserEntity();
		ue.setId("uuid");
		ue.setName("小minge");
		ue.setAge(24);
		System.out.println(ue);
	}
}

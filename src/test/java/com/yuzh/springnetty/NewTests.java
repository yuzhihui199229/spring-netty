package com.yuzh.springnetty;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewTests {

	@BeforeEach
	void beforeTest(){
		System.out.println("在每个测试开始之前");
	}

	@Test
	@DisplayName("测试test")
	void contextLoads() {
		System.out.println("fjsjflsj");
	}



}

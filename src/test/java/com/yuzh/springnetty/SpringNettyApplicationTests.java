package com.yuzh.springnetty;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
@DisplayName("spring测试")
class SpringNettyApplicationTests {
    @BeforeAll
    static void beforeAllTest() {
        System.out.println("beforeAll test!");
    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("after all test");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("在每个测试开始之前111111");
    }

    @Test
    @DisplayName("测试test")
    void contextLoads() {
        System.out.println("fjsjflsj");
    }

    @Test
    @DisplayName("测试test1")
    void contextLoads1() {
        System.out.println("fjsjflsj1111111111");
    }

    @AfterEach
    void afterTest() {
        System.out.println("每个测试之后执行");
    }

}

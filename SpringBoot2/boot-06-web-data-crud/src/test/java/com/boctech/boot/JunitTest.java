package com.boctech.boot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/13- 12:18
 * Description:
 */
@DisplayName("Junit5功能测试类")
public class JunitTest {

    @DisplayName("测试displayname注解")
    @Test
    void testDisplayName() {
      //  System.out.println(1);
    }

    @DisplayName("测试简单断言")
    @Test
    void testSimpleAsserations(){
        int cal = cal(2,3);
        assertEquals(5,cal,"业务逻辑计算失败");
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertSame(obj1,obj2,"两个对象不一样");
    }

    int cal(int i,int j) {
        return i+j;
    }

    @Disabled
    @DisplayName("测试方法2")
    @Test
    void test2() {
     //   System.out.println(2);
    }

    @BeforeEach
    void testBeforeEach() {
      //  System.out.println("测试就要开始啦啦啦啦啦");
    }

    @AfterEach
    void testAfterEach() {
      //  System.out.println("测试结束啦啦");
    }

    @BeforeAll
    static void testBeforeAll() {
     //   System.out.println("所有测试就要开始了");
    }

    @AfterAll
    static void testAfterAll() {
     //   System.out.println("所有测试已经结束了");
    }
}

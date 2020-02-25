package com.ray.util;
 
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by L on 2017-07-25.
 */
public class TaskTest {

    @Test
    public void test() throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Thread.sleep(60000);
    }
} 

package com.sciatta.dev.java.spring.core.ioc.applicationcontext.processor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangxiaoyu on 2018/9/17<br>
 * All Rights Reserved(C) 2017 - 2018 SCIATTA<br><p/>
 * AnimalProcessorTests
 */
public class AnimalProcessorTests {
    ConfigurableApplicationContext applicationContext;
    
    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("application-context-processor.xml");
    }
    
    @After
    public void destroy() {
        applicationContext.registerShutdownHook();
    }
    
    @Test
    public void testProcessor() {
        Animal animal = applicationContext.getBean("animal", Animal.class);
        assertNotNull(animal);
        assertEquals(0, animal.getName().indexOf("#"));
        assertEquals(animal.getName().length() - 1, animal.getName().lastIndexOf("#"));
    }
    
}

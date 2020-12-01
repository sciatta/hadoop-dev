package com.sciatta.hadoop.java.spring.core.aop.jdk;

import com.sciatta.hadoop.java.spring.core.aop.common.Name;
import com.sciatta.hadoop.java.spring.core.aop.common.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangxiaoyu on 2020/11/30<br>
 * All Rights Reserved(C) 2017 - 2020 SCIATTA<br><p/>
 * UserProxyFactoryTests
 */
public class UserProxyFactoryTests {
    @Test
    public void testGetUser() {
        User user = new User();
        Object ret = UserProxyFactory.getUser(user);
        
        assertTrue(ret instanceof Name);
        
        String name = "root";
        Name retUser = (Name) ret;
        retUser.setName(name);
        
        assertEquals(name, retUser.getName());
    }
}

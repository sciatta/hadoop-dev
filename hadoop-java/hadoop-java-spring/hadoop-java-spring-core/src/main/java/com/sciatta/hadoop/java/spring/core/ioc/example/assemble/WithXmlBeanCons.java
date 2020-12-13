package com.sciatta.hadoop.java.spring.core.ioc.example.assemble;

import com.sciatta.hadoop.java.spring.core.model.Name;

/**
 * Created by yangxiaoyu on 2020/12/13<br>
 * All Rights Reserved(C) 2017 - 2020 SCIATTA<br><p/>
 * WithXmlBeanCons
 */
public class WithXmlBeanCons extends BaseBean {
    
    public WithXmlBeanCons(Name user) {
        this.user = user;
    }

}

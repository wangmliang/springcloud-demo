package com.springcloud.dao.impl;

import com.springcloud.dao.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * <b>Title：</b>SchedualServiceHiHystric.java<br/>
 * <b>@author：</b>WML<br/>
 * <b>@date：</b>2018/4/25 - 16:22<br/>
 * <b>@version V1.0</b></br/>
 * <b>Copyright (c) 2018 ASPire Tech.</b>
 * </pre>
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

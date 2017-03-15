package com.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.DemoService;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/14
 * Time: 18:35
 */
@Service
public class DemoServiceImpl implements DemoService {

    public String say(String name) {
        return "hello" + name;
    }
}

package com.dubbo.demo.provider;

import com.dubbo.demo.DemoService;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/14
 * Time: 18:35
 */
public class DemoServiceImpl implements DemoService {

    public String say(String name) {
        return "hello" + name;
    }
}

package com.heihaier.dubbo.demo.provider;

import com.heihaier.dubbo.demo.DemoService;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/15
 * Time: 12:21
 */
public class DemoServiceImpl implements DemoService {

    public String say(String name) {
        return "hello" + name;
    }
}

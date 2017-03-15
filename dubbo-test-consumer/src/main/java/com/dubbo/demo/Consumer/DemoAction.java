package com.dubbo.demo.Consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.DemoService;
import org.springframework.stereotype.Component;

/**
 * User: heihaier@xfuweng.com
 * Date: 2017/3/15
 * Time: 18:26
 */
@Component
public class DemoAction {

    @Reference
    private DemoService demoService;

    public String test() {
        return demoService.say("heihaier");
    }
}

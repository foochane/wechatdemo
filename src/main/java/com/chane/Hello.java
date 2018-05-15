package com.chane;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fucheng on 2018/5/15.
 */

@RestController
public class Hello
{
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return  "hello spring boot";
    }
}

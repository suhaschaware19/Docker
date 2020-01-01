package com.library.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Library {
    @ResponseBody
    @RequestMapping("message")
    public String printmessages(){
        return "hello from library";
    }

}

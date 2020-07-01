package com.springboot.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author BGY
 * @date 2020/6/7 - 20:24
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }

}

package com.banun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anas Banun on 11/6/15.
 */
@Controller
public class IndexController {

   
    @RequestMapping({"index1", ""})
    public String index2(){
        return "index1";
    }    
        

    @RequestMapping("/access_denied")
    public String notAuth(){
        return "access_denied";
    }

    @RequestMapping("login")
    public String loginForm(){
        return "banking/index";
    }
}

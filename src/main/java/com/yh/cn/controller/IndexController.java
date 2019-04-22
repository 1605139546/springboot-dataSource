package com.yh.cn.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(HttpSession session){
        return "index";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @GetMapping("/logout")
    public void logOut(Authentication authentication, HttpServletResponse response) throws IOException {
        authentication.getAuthorities().clear();
        response.sendRedirect("http://localhost:8080/server/oauth/exit");

    }

}

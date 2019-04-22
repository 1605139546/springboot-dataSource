package com.yh.cn.controller;

import com.alibaba.fastjson.JSONObject;
import com.yh.cn.entity.SysUser;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/info")
    @ResponseBody
    public Principal info(Principal principal) {
        String name = principal.getName();
        System.out.println(name);

        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(name));
        Object principal1 = jsonObject.get("principal");
        return principal;
    }



    @GetMapping("/me")
    @ResponseBody
    public SysUser me(Authentication authentication){
        Map<String,Object> users = (Map<String, Object>) authentication.getPrincipal();
        Map<String,Object> map = (Map<String, Object>) users.get("principal");
        SysUser sysUser = JSONObject.parseObject(JSONObject.toJSONString(map), SysUser.class);
        return sysUser;
    }


}

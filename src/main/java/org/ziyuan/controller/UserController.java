package org.ziyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ziyuan.pojo.Result;
import org.ziyuan.pojo.User;

import javax.servlet.http.HttpSession;

/**
 * @author sunziyuan
 * @date 2024/1/16 22:00
 */
@RestController
public class UserController {

    @GetMapping("/login")
    public Result login(User user, HttpSession session){
        Result result = new Result();
        if(!ObjectUtils.isEmpty(user) && user.getPassword().equals("123")){
            result.setFlag(true);
            // 将用户名存储到session对象中
            session.setAttribute("user",user.getUsername());
        } else {
            result.setFlag(false);
            result.setMessage("登录失败！");
        }

        return result;
    }

    @GetMapping("getUsername")
    public String getUsername(HttpSession session){
        String username = (String) session.getAttribute("user");
        return username;
    }
}

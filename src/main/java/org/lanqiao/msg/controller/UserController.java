package org.lanqiao.msg.controller;

import org.lanqiao.msg.enity.User;
import org.lanqiao.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
//类需要自动生成对象
//类中方法返回json
public class UserController {
  //这是假装修改
    @Autowired
    UserService userService;
    @RequestMapping("/get")
    public List<User> getAll() {
        return userService.getAllUser();
    }
//

    @RequestMapping("/check")
    public boolean check(User user){
        System.out.println(user.getUsername());
        return userService.checkUser(user);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello!";
    }
    @RequestMapping("/set")
    public String set(){ return "this is ont";}
}

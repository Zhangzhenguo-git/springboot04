package com.zhang.springboot04.controller;

import com.zhang.springboot04.entity.User;
import com.zhang.springboot04.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

//    传参跳转
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
//        启动页面跳转
        return page;
    }
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public String addUser(User user){
        try {
            int count=userService.addUser(user);
            System.out.println("执行"+count+"");
            if (count>0){
                return "redirect:/user/userlist";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "add";
    }
    @RequestMapping("/userlist")
    public String userlist(Model model){
        List<User> userList= null;
        try {
            userList = userService.getUser();
            model.addAttribute("userList",userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "userlist";
    }
    @GetMapping("/toUpdate")
    public String findById(int id,Model model){
        try {
            User userItem=userService.findById(id);
            model.addAttribute("userItem",userItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "update";
    }
    @PostMapping("/update")
    public String reStartSelectUser(User user){
        int count= 0;
        try {
            count = userService.reStartSelectUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (count>0){
            return "redirect:/user/userlist";
        }
        return "redirect:/user/toUpdate?id="+user.getId();
    }
//    rect风格传值
    @RequestMapping("/toDelete/{id}")
    public String toDelete(@PathVariable int id){
        try {
            int count=userService.toDelete(id);
            if (count>0){
                return "redirect:/user/userlist";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/user/userlist";

    }
}

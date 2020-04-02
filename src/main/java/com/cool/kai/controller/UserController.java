package com.cool.kai.controller;

import com.cool.kai.model.User;
import com.cool.kai.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    @ResponseBody
    public PageInfo<User> pageInfoUser(@RequestParam(name ="pageNum") int pageNum,
                                       @RequestParam int pageSize){
        return userService.pageInfo(pageNum,pageSize);
    }

    @GetMapping("/findById")
    @ResponseBody
    public User findById(@RequestParam Long id){

        return userService.findById(id);
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}

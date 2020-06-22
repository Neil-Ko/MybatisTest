package com.cool.kai.controller;

import com.cool.kai.model.User;
import com.cool.kai.service.UserService;
import com.cool.kai.utils.RedisUtils;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/test")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/getUsers")
    @ResponseBody
    public PageInfo<User> pageInfoUser(@RequestParam(name ="pageNum") int pageNum,
                                       @RequestParam int pageSize){
        return userService.pageInfo(pageNum,pageSize);
    }

    @GetMapping("/findById")
    @ResponseBody
    public User findById(@RequestParam Long id){
        log.info("sdf");
        redisUtils.set("id",id);
        System.out.println("redis缓存值:"+redisUtils.get("id"));
        return userService.findById(id);
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}

package com.cool.kai.service;

import com.cool.kai.model.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    int addUser(User user);

    List<User> listAll();

    PageInfo<User> pageInfo(int pageNum,int pageSize);

    User findById(Long id);
}

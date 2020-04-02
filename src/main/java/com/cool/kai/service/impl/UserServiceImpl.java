package com.cool.kai.service.impl;

import com.cool.kai.dao.UserDao;
import com.cool.kai.model.User;
import com.cool.kai.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insertInto(user);
    }

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }

    @Override
    public PageInfo<User> pageInfo(int pageNum, int pageSize ) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.listAll();
        PageInfo pageInfo = new PageInfo(users);
        return pageInfo;
    }

    @Override
    public User findById(Long id) {

        return userDao.findById(id);
    }
}

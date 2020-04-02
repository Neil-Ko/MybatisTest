package com.cool.kai.dao;

import com.cool.kai.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    User findById(@Param("id") Long id);
    int insertInto(User user);
    List<User> listAll();
}

package com.itheima.dao;

import com.itheima.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    @Insert("insert into users(username,password,telephone,state)value(#{username},#{password},#{telephone},#{state})")
    void addUser(Users users);
}

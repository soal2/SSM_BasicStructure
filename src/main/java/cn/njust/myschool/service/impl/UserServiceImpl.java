package cn.njust.myschool.service.impl;

import cn.njust.myschool.entity.User;
import cn.njust.myschool.mapper.UserMapper;
import cn.njust.myschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}

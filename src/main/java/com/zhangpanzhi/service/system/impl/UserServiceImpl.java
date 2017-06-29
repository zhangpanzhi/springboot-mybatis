package com.zhangpanzhi.service.system.impl;

import com.zhangpanzhi.mapper.system.UserMapper;
import com.zhangpanzhi.model.system.User;
import com.zhangpanzhi.service.system.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-6-29.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int saveUserWithBackId(User user) {
        return userMapper.insertUserWithBackId(user);
    }
}

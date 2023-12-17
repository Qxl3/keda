package com.itheima.keda.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.keda.entity.User;
import com.itheima.keda.mapper.UserMapper;
import com.itheima.keda.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}

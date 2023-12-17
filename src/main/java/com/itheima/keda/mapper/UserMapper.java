package com.itheima.keda.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.keda.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}

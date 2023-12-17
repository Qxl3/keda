package com.itheima.keda.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.keda.entity.OrderDetail;
import com.itheima.keda.mapper.OrderDetailMapper;
import com.itheima.keda.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
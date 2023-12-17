package com.itheima.keda.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.keda.entity.AddressBook;
import com.itheima.keda.mapper.AddressBookMapper;
import com.itheima.keda.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}

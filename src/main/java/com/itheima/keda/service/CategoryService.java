package com.itheima.keda.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.keda.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}

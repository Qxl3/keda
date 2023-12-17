package com.itheima.keda.dto;

import com.itheima.keda.entity.Setmeal;
import com.itheima.keda.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

package com.itheima.springbootmybatis.mapper;

import com.itheima.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-05-09-[下午 3:43]-周二
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    public List<User> findAll();
}

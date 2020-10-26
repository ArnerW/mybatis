package com.arner.mybatis.mapper;

import com.arner.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);
    User selectById(@Param("id") int id);
}

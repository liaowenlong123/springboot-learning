package com.lwl.springbootmybatis2.mapper;

import com.lwl.springbootmybatis2.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(@Param("id")int id);
}

package com.lwl.springbootmybatis1.mapper;

import com.lwl.springbootmybatis1.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository  //注：如果不加此注解，idea会报错，但是不影响结果
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id=#{id}")
    User findById(@Param("id") int id);
}

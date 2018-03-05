package com.cyx.dao;

import com.cyx.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into user(user_id,user_name,user_sex) values (#{user_id},#{user_name},#{user_sex})")
    int insertUser(User user);
}

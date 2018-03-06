package com.cyx.dao;

import com.cyx.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    /*
    * 插入数据到数据库
    * @param user 用户的pojo类
    * */
    @Insert("insert into user(name,sex,password) values (#{name}, #{sex}, #{password})")
    int insertUser(User user);

    @Select("SELECT * FROM `user` where user.name=#{name} and user.password = #{password}")
    User selectUser(@Param("name")String username,@Param("password") String password);
}

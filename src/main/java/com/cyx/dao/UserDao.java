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
    @Insert("insert into usersupport_user(work_number,username,password,email,phone,gmt_create,status)VALUES(#{workNumber},#{username},#{password},#{email},#{phone},#{gmtCreate},#{status})")
    int insertUser(User user);
    @Select("select * from usersupport_user where username = #{username}")
    User findByName(@Param("username") String username);
}

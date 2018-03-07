package com.cyx.dao;

import com.cyx.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface RoleDao {
    @Select("SELECT role.* FROM user_role JOIN role ON user_role.role_id = role.role_id WHERE user_id = #{userId}")
    List<Role> findRoleByid(@Param("userId") Long id);
}

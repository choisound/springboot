package com.cyx.dao;

import com.cyx.domain.Menu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuDao {
        @Insert("insert into menu(menu_url,status,gmt_create,creator,description)VALUES(#{menuUrl},#{status},#{gmtCreate},#{creator},#{description})")
        int insertMenu(Menu menu);
        @Select("select menu.* from ")
        List<Menu> findMenuById(Long userId);
}

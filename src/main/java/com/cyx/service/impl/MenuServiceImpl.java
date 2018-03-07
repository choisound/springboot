package com.cyx.service.impl;

import com.cyx.dao.MenuDao;
import com.cyx.domain.Menu;
import com.cyx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    MenuDao menuDao;
    @Override
    public int insertMenu(Menu menu) {
        return menuDao.insertMenu(menu);
    }
}

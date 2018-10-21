/*
 * 文件名：MenuController.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： MenuController.java
 * 修改人：Administrator
 * 修改时间：2018/5/15
 */
package com.qwan.web.controller;

import com.qwan.common.log.ILogger;
import com.qwan.common.log.LoggerFactory;
import com.qwan.web.dao.IMenuDAO;
import com.qwan.web.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/5/15
 */
@RestController
@RequestMapping(value = "/menu")
public class MenuController
{
    private static final ILogger logger = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    private IMenuDAO menuDAO;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Menu add(Menu menu)
    {
        if (null == menu || StringUtils.isEmpty(menu.getName()))
        {
            logger.debug().warn("menu can not be null.");
            return null;
        }
        if (null != menuDAO.find(menu.getName()))
        {
            logger.debug().warn("menu already exists, change another name.{}", menu.getName());
            return null;
        }
        menuDAO.add(menu);
        return menu;
    }

    @RequestMapping(value = "/list")
    public List<Menu> listAll()
    {
        return menuDAO.listAll();
    }

    @RequestMapping(value = "/")
    public Menu constructMenu()
    {
        List<Menu> menus = menuDAO.listAll();

        Menu root = null;
        for (Menu menu : menus)
        {
            if (0 == menu.getParentId())
            {
                root = menu;
                break;
            }
        }
        if (null != root)
        {
            tree(root, menus);
        }
        return root;
    }

    private void tree(Menu parent, List<Menu> menus)
    {
        for (Menu menu : menus)
        {
            if (parent.getId() == menu.getParentId())
            {
                if (null == parent.getChildren())
                {
                    parent.setChildren(new ArrayList<>());
                }
                parent.getChildren().add(menu);
                tree(menu, menus);
            }
        }
    }
}

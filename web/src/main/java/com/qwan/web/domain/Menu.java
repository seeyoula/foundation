/*
 * 文件名：Menu.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Menu.java
 * 修改人：Administrator
 * 修改时间：2018/5/15
 */
package com.qwan.web.domain;

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
public class Menu
{
    private int id;

    private String name;

    private String url;

    private int parentId;

    private Menu parent;

    private int privilegeId;

    private Privilege privilege;

    private List<Menu> children;

    public int getId()
    {
        return id;

    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public Menu getParent()
    {
        return parent;
    }

    public void setParent(Menu parent)
    {
        this.parent = parent;
    }

    public int getParentId()
    {
        return parentId;
    }

    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }

    public int getPrivilegeId()
    {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId)
    {
        this.privilegeId = privilegeId;
    }

    public Privilege getPrivilege()
    {
        return privilege;
    }

    public void setPrivilege(Privilege privilege)
    {
        this.privilege = privilege;
    }

    public List<Menu> getChildren()
    {
        return children;
    }

    public void setChildren(List<Menu> children)
    {
        this.children = children;
    }
}

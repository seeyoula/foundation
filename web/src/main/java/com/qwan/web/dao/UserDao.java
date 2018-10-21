/*
 * 文件名：UserDao.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserDao.java
 * 修改人：Administrator
 * 修改时间：2018/5/7
 */
package com.qwan.web.dao;

import com.qwan.web.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/5/7
 */
@Component
@Mapper
public interface UserDao
{
    User getUserById(@Param("id") int id);

    int updateUser(@Param("user") User user);

    int insertUser(@Param("user") User user);

    int deleteUserById(@Param("id") int id);
}

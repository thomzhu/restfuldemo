package com.thom.dao;

import com.thom.bean.User;
import org.apache.ibatis.annotations.*;

/**
 * Demo class
 *
 * @author Zhany
 * @date 2019/3/13:13:19
 * @Description
 */
@Mapper
public interface UserDao {
    @Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age}")
    void addUser(User user);

    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    @Select("select id,name,age from t_user where name=#{userName}")
    User findByName(@Param("userName") String userName);

    @Select("select id,name.age from t_user where id=#{userId}")
    User findById(@Param("userId")int userId);

    @Select("select id,name,age from t_user where age=#{userAge}")
    User findByAge(@Param("userAge") int userAge);
}

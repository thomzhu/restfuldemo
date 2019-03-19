package com.thom.service;

import com.thom.bean.User;

/**
 * Demo class
 *
 * @author Zhany
 * @date 2019/3/13:13:33
 * @Description
 */
public interface UserService {
    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserByName(String userName);
    User findUserById(int userId);
    User findUserByAge(int userAge);

}

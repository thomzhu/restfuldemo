package com.thom.service;

import com.thom.bean.User;
import com.thom.dao.UserDao;

/**
 * Demo class
 *
 * @author Zhany
 * @date 2019/3/13:13:38
 * @Description
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }

    @Override
    public User findUserById(int userId) {
        return userDao.findById(userId);
    }

    @Override
    public User findUserByAge(int userAge) {
        return userDao.findByAge(userAge);
    }
}

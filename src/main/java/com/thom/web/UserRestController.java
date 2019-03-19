package com.thom.web;

import com.thom.bean.User;
import com.thom.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author Thomz
 * @date 2019/3/13:13:52
 * @Description
 */

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(User user){
        System.out.println("开始新增...");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public boolean updateUser(User user){
        System.out.println("开始更新...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteId",method = RequestMethod.DELETE)
    public boolean deleteUser(int userId){
        System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }

    @RequestMapping(value = "/userId",method = RequestMethod.GET)
    public User findByUserId(@RequestParam(value = "userId",required = true) int userId){
        System.out.println("开始查询...");
        return userService.findUserById(userId);
    }
    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
        System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }
    @RequestMapping(value = "/userAge", method = RequestMethod.GET)
    public User findByUserAge(@RequestParam(value = "userAge", required = true) int userAge) {
        System.out.println("开始查询...");
        return userService.findUserByAge(userAge);
    }
}

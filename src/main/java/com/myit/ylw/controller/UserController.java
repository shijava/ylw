package com.myit.ylw.controller;

import com.myit.ylw.common.Const;
import com.myit.ylw.common.ServerResponse;
import com.myit.ylw.pojo.User;
import com.myit.ylw.service.inface.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by H1 on 2018/2/11.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    private UsersService usersService;
    /**
     * 用户登录
     * @param username 用户名
     * @param password 用户密码
     * @param session 用户session
     * @return
     */
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session)
    {
        ServerResponse<User> response=usersService.login(username,password);
        if (response.isSuccess()){
            session.setAttribute(Const.current_user,response.getData());
        }
        return  response;
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping(value = "logout.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.current_user);
        return ServerResponse.createBySuccess();
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user){
        return usersService.register(user);
    }

    /**
     * 校验
     * @param string
     * @param type
     * @return
     */
    @RequestMapping(value = "checkValid.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String string, String type){
       return usersService.checkValid(string,type);
    }

    /**
     * 获取用户信息
     * @param session
     * @return
     */
    @RequestMapping(value = "get_user_info.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user=(User)session.getAttribute(Const.current_user);
        if (user!=null){
            return  ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErroMessage("用户未登录，无法获取当前信息");
    }
    public ServerResponse<String> forgetPass(String username){
        return usersService.selectByUsername(username);
    }


    }

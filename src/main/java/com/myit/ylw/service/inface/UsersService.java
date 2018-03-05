package com.myit.ylw.service.inface;

import com.myit.ylw.common.ServerResponse;
import com.myit.ylw.pojo.User;

/**
 * Created by H1 on 2018/2/11.
 */
public interface UsersService {
    ServerResponse<User> login(String username, String passwd);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String string,String type);
    ServerResponse<String> selectByUsername(String username);
}

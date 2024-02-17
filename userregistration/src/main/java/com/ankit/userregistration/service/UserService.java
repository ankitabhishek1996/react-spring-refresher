package com.ankit.userregistration.service;

import com.ankit.userregistration.dao.UserDao;
import com.ankit.userregistration.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserInfo findUserById(long id) {
        Optional<UserInfo> byId =
                userDao.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    public String saveUser(UserInfo userInfo) {
        if (userInfo != null) {
            userDao.save(userInfo);
            return "User saved successfully";
        }
        return "some issue is there";

    }

}

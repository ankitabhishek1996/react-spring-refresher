package com.ankit.userregistration;

import com.ankit.userregistration.entity.UserInfo;
import com.ankit.userregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
@CrossOrigin(origins = "http://localhost:5173")
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/getALl/{id}")
    public UserInfo getByIdUserInfo(@PathVariable("id") Long id) {

        return userService.findUserById(id);
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody UserInfo userInfo) {
        return userService.saveUser(userInfo);
    }


}

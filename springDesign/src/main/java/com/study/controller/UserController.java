7package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.entity.User;

/**
 * 
* @ClassName: UserController 
* @Description: 用户控制层
* @Author z
* @DateTime 2020年2月25日 下午2:52:03
 */
@Controller
public class UserController {
	
	
    @GetMapping("/index")
    public String index(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("[Michael]");
            user.setAddress("[china springboot]+" + i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "index";
    }
    
    @GetMapping("/clock")
	public String clock(Model model) {  
		return "base/clock";
	}
}

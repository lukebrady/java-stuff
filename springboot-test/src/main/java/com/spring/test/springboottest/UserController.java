package com.spring.test.springboottest;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

class UserSelector {
    private String[] userArray = new String[]{
            "Luke",
            "Kayla",
            "Tanooki",
            "Link",
            "Mario"
    };

    UserSelector() { }

    protected String getRandomUser() {
        int randomInt = (int) (Math.random() * 4 - 0);
        return this.userArray[randomInt];
    }

}

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model) {
        String userName = new UserSelector().getRandomUser();
        model.addAttribute("username", userName);
        return "user_page";
    }
}
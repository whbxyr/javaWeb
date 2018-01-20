package cn.whbxyr.controller;

import org.springframework.stereotype.Controller;
import cn.whbxyr.user.UserDetail;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/spring")
public class TestSpringmvcController {

    public UserDetail getUser() {
        UserDetail user = new UserDetail();
        user.setName("ray");
        user.setAge(22);
        user.setGrade(16);
        return user;
    }
    @RequestMapping(value="/world", method=RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("msg", "你好spring mvc");
        return "index";
    }
}

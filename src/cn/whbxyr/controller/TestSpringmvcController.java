package cn.whbxyr.controller;

import cn.whbxyr.user.UserDetail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/spring")
public class TestSpringmvcController {

    private UserDetail getUser() {
        UserDetail user = new UserDetail();
        user.setName("ray");
        user.setAge(22);
        user.setGrade(16);
        return user;
    }

    @ResponseBody
    @RequestMapping(value="/world", method=RequestMethod.GET)
    public Map hello(Model model){
        // model.addAttribute("msg", "你好spring mvc");
        // return "index";
        // UserDetail user = getUser();
        // return user;
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "222");
        map.put("password", "12");
        return map;
        // UserDetail user = getUser();
        // return user;
    }
}

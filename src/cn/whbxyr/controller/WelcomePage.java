package cn.whbxyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomePage {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object sayHello(Model model) {
        model.addAttribute("msg", "欢迎光临");
        return "index";
    }
}
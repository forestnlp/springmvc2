package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/login")
    public String login(HttpSession session,HttpServletRequest request){
        session.setAttribute("skey","sessionVal的值");
        request.setAttribute("rkey","requestVal的值");
        return "login";
    }


    @RequestMapping("register")
    public String register(Model model){
        model.addAttribute("msg","欢迎注册");
        return "register";
    }
}

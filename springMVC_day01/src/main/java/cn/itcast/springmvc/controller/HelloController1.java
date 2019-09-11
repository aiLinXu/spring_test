package cn.itcast.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@Controller
public class HelloController1 {
    @RequestMapping("hello")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","这是springMVC的第一个项目");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}

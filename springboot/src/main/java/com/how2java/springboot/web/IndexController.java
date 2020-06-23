package com.how2java.springboot.web;

import com.how2java.springboot.service.autoScheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @Autowired
    autoScheService autoScheService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/autoSchedule")
    public void autoSchedule() throws Exception {
        autoScheService.autoSche();
    }
}

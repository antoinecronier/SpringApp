package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("thought")
public class SessionViewController {

	@RequestMapping(value="/single-field")
    public ModelAndView singleFieldPage() {
        return new ModelAndView("single-field-page");
    }

    @RequestMapping(value="/remember")
    public ModelAndView rememberThought(@RequestParam String thoughtParam) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("thought", thoughtParam);
        modelAndView.setViewName("single-field-page");
        return modelAndView;
    }
}

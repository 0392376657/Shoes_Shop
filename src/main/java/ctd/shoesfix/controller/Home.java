package ctd.shoesfix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @GetMapping(value = {"/index", "/", ""})
    public String homePage() {
        return "/shop/index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "/shop/contact";
    }
}

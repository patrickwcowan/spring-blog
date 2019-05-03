package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "This is your landing page!";
    }

    @GetMapping("/roll-dice")
    public String welcome() {
        return "dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String welcomeDie(@PathVariable int n, Model model) {
        int random = (int)(Math.random() * 6 + 1);
        int counter = 0;



        model.addAttribute("n",n);
        model.addAttribute("random", random);


        if(n == random){

            model.addAttribute("counter", counter);
            model.addAttribute("winner",true);
        }
        if(n != random){
            model.addAttribute("loser",true);
        }


        return "dice";
    }


}

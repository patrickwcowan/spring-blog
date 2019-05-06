package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class HomeController {

    public int Counter;

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "This is your landing page!";
    }

    @GetMapping("/roll-dice")
    public String welcome(HttpSession session) {
        session.setAttribute("counter", 0);
        return "diceWelcome";
    }

    @Controller
    public class StudentController {
        @RequestMapping(value = "/roll-dice", method = RequestMethod.POST)
        public String saveStudent(@ModelAttribute String input, BindingResult errors, Model model) {
            // logic to process input data
            return "diceWelcome";
        }
    }


    @GetMapping("/roll-dice/{n}")
    public String welcomeDie(@PathVariable int n, Model model, HttpSession session) {
        int counter = (Integer) session.getAttribute("counter");
        int random = (int)(Math.random() * 6 + 1);
        int randomizer = (int)(Math.random() * 6);
        ArrayList<String> randomDice = new ArrayList<>();
        randomDice.add("/img/die1.png");
        randomDice.add("/img/die2.png");
        randomDice.add("/img/die3.png");
        randomDice.add("/img/die4.png");
        randomDice.add("/img/die5.png");
        randomDice.add("/img/die6.png");
        String randomPic = randomDice.get(randomizer);
        System.out.println(counter);


        model.addAttribute("randomPic", randomPic);
        model.addAttribute("randomizer",randomizer);
        model.addAttribute("n",n);
        model.addAttribute("random", random);
        model.addAttribute("counter", counter);



        if(n == randomizer){
            model.addAttribute("winner",true);
            session.setAttribute("counter",( (Integer) session.getAttribute("counter")) + 1);
        }
        if(n != randomizer){
            model.addAttribute("loser",true);
            session.setAttribute("counter",( (Integer) session.getAttribute("counter")) - 1);
        }




        return "dice";
    }


}

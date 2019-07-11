package fr.cci.controle.myapi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/pokedex")
public class HomeController {

    @RequestMapping("/home")
    public String showHomepage(@RequestParam(required = false) String page, Model model){
        if (page != null || page == "2#") {
            model.addAttribute("page", page);
            return "Homepage";
        } else {
            page = "1";
            model.addAttribute("page", page);
            return "Homepage";
        }
    }


}

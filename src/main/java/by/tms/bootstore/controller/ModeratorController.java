package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/moderMenu")
public class ModeratorController {

    @GetMapping
    public String form(){
        return "accountOption/profiles/moderatorProfile";
    }
}
package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/addBook")
public class AddBookController {

    @GetMapping
    public String form() {
        return "accountOption/actions/createBook";
    }

}
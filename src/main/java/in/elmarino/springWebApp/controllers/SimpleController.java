package in.elmarino.springWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {

    @RequestMapping("/")
    public String acceptRequest(){
        return "Request accepted from the controllers!";
    }

    @RequestMapping("/about")
    public String aboutUs(){
        return "About us content here.";
    }
}

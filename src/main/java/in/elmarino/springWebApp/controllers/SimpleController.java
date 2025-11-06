package in.elmarino.springWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController // uses REST API to send data from server to client.
public class SimpleController {

    @RequestMapping("/")
              // or
    // @ResponseBody // you can use this annotation if you use only @Controller
    public String acceptRequest(){
        return "Request accepted from the controllers!";
        // here we're just returning the data not the view [.jsp file]
    }

    @RequestMapping("/about")
    public String aboutUs(){
        return "About us content here.";
    }

}

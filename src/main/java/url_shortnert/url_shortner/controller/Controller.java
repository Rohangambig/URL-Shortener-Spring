package url_shortnert.url_shortner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("health")
    public String health() {
         System.out.println("Servr");
        System.out.println("Servr");
        return "Server is listening...";
       
    }
}

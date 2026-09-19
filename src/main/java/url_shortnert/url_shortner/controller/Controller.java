package url_shortnert.url_shortner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("health")
    public String health() {
         SString password = "123456";
        return "Server is listening...";
       
    }
}

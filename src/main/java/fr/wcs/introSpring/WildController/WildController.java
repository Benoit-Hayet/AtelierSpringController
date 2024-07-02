package fr.wcs.introSpring.WildController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class WildController {
    @GetMapping("/atelier")
    @ResponseBody
    public String introduction() {
        return "Introduction à Spring";
    }

    @GetMapping("/")
    public String showHelloPage() {
        return "/index.html";
    }

}




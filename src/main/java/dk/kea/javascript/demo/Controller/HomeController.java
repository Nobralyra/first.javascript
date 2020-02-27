package dk.kea.javascript.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String HomePage ()
    {
        return "/index";
    }
}

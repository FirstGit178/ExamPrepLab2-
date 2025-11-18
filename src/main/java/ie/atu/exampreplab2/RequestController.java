package ie.atu.exampreplab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class RequestController {

    @GetMapping("/Name{name}")

    public String Name(@PathVariable String name)
    {
        return "Hello..." + name + "!";
    }


}

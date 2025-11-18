package ie.atu.exampreplab2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class RequestController {

    @GetMapping("/Name{name}")

    public String Name(@PathVariable String name)
    {
        return "Hello..." + name + "!";
    }

    @GetMapping("/Details")

    public String Details(@RequestParam String name, @RequestParam int age)
    {
        return "Name: " + name + ", Age: " + age;

    }


}

package match_tracker.Match.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DeafultController {
    @GetMapping("")
    public String index() {
        return "DeafultController";
    }
}

package match_tracker.Match.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // A helyes Model import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class DeafultController {

    @GetMapping("/")
    public String indexWithModel(Model model) {
        model.addAttribute("message", "Helló, Thymeleaf!");
        return "index";
    }
}

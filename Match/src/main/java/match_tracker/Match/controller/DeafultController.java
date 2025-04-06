package match_tracker.Match.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeafultController {

    @GetMapping("/")
    public String indexWithModel(Model model) {
        model.addAttribute("message", "Helló, Thymeleaf!");
        return "index";
    }
}

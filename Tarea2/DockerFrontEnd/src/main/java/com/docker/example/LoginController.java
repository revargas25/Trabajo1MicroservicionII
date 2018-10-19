/**
 * 
 */
package com.docker.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rafael.e.vargas
 *
 */
@Controller
public class LoginController {
	@GetMapping("/login")
    public String login(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
}

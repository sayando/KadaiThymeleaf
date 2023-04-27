
package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OutputController {

    @GetMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("previous", inputValue);
        return "redirect:/input";
    }

}

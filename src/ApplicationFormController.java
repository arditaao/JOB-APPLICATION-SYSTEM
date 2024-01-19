
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationFormController {

    @GetMapping("/application-form")
    public String displayForm(Model model) {
        model.addAttribute("applicationForm", new ApplicationForm());
        return "application-form";
    }

    @PostMapping("/submitApplication")
    public String submitForm(@ModelAttribute("applicationForm") ApplicationForm applicationForm) {
        // Here you can process the submitted application form
        // ...

        return "redirect:/success";
    }
}  

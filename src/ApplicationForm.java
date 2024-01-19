import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;

public class ApplicationForm {
    public class ApplicationForm {
    private String lastName;
    private String email;
     @ModelAttribute("position")
    public String getPosition() {
    return position;
    }

   public void setPosition(String position) {
       this.position = position;
    }

    // Getters and setters for the class attributes
    // ...
}

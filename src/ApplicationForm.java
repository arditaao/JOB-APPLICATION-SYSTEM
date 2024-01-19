import java.util.ArrayList;
import java.util.List;

public class ApplicationForm {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String position;
    private String coverLetter;
    private List<String> attachments;

    public ApplicationForm() {
        attachments = new ArrayList<>();
    }

    // Getters and setters for the class attributes
    // ...
    <form action="#" th:action="@{/submitApplication}" th:object="${applicationForm}" method="post">
    <!-- The rest of the form remains the same -->
</form>
}

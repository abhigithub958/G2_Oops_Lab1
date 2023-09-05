public class departmentIdentifier {
    public static void main(String[] args) {
        String email = "john.doe@technical.example.com";

        String department = determineDepartment(email);

        System.out.println("Department: " + department);
    }

    public static String determineDepartment(String email) {
        String[] parts = email.split("@");
        if (parts.length == 2) {
            String domain = parts[1].toLowerCase();
            if (domain.contains("technical")) {
                return "Technical";
            } else if (domain.contains("admin")) {
                return "Admin";
            } else if (domain.contains("human")) {
                return "Human Resources";
            } else if (domain.contains("legal")) {
                return "Legal";
            } else {
                return "Unknown";
            }
        } else {
            return "Invalid Email";
        }
    }
}
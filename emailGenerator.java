public class emailGenerator {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String department = "sales";
        String company = "example";

        // Generate the email address
        String email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company.toLowerCase() + ".com";

        System.out.println("Generated Email Address: " + email);
    }
}
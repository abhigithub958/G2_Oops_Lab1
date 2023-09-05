public class Main {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String department = "technical";
        String company = "example";
        int passwordLength = 12;

        // Generate and display credentials
        CredentialService.showCredentials(firstName, lastName, department, company, passwordLength);
    }
}
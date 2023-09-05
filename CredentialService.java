import java.security.SecureRandom;

public class CredentialService {
    // Constants for character sets
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+[]{}|;':,.<>?";

    // Method to generate a random password
    public static String generatePassword(int length) {
        String allChars = UPPERCASE_CHARS + LOWERCASE_CHARS + DIGITS + SPECIAL_CHARS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }

    // Method to generate an email address
    public static String generateEmailAddress(String firstName, String lastName, String department, String company) {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company.toLowerCase() + ".com";
    }

    // Method to display credentials
    public static void showCredentials(String firstName, String lastName, String department, String company, int passwordLength) {
        String email = generateEmailAddress(firstName, lastName, department, company);
        String password = generatePassword(passwordLength);

        System.out.println("Email Address: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String department = "technical";
        String company = "example";
        int passwordLength = 12;

        // Generate and display credentials
        showCredentials(firstName, lastName, department, company, passwordLength);
    }
}
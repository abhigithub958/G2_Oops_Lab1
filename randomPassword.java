import java.util.Random;
public class randomPassword {
	public static void main(String[] args) {
		// Length of your password.
		int length = 8;
		for (int i = 0; i < 100; i++) {
			String password = generatePassword(length);
			System.out.println("New Password: " + password);
		}
	}
	/*
	 * This our Password generating method. We have use static here, so that we not
	 * to make any object for it.
	 */
	private static String generatePassword(int length) {
		System.out.println("Generating password using random() : ");
		System.out.print("Your new password is : ");
		/*
		 * A strong password has Cap_chars, Lower_chars, numeric value and symbols. So
		 * we are using all of them to generate our password
		 */
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String values = Capital_chars + Small_chars + numbers + symbols;
		// Using random method
		Random random = new Random();
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
	}
}

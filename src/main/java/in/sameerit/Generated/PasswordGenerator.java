package in.sameerit.Generated;

import java.security.SecureRandom;

public class PasswordGenerator {
	
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?/[]{}";
	private static final String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS;

	private static final SecureRandom RANDOM = new SecureRandom();

	public static String generatePassword(int length) {
		if (length < 8) {
			throw new IllegalArgumentException("Password length must be at least 8 characters for security.");
		}

		StringBuilder password = new StringBuilder(length);

		password.append(UPPERCASE.charAt(RANDOM.nextInt(UPPERCASE.length())));
		password.append(LOWERCASE.charAt(RANDOM.nextInt(LOWERCASE.length())));
		password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
		password.append(SPECIAL_CHARACTERS.charAt(RANDOM.nextInt(SPECIAL_CHARACTERS.length())));

		for (int i = 4; i < length; i++) {
			password.append(ALL_CHARACTERS.charAt(RANDOM.nextInt(ALL_CHARACTERS.length())));
		}

		return shufflePassword(password.toString());
	}

	private static String shufflePassword(String password) {
		char[] characters = password.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			int randomIndex = RANDOM.nextInt(characters.length);
			char temp = characters[i];
			characters[i] = characters[randomIndex];
			characters[randomIndex] = temp;
		}
		return new String(characters);
	}

}

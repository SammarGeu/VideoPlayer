import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class pass {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }

    public static String getPasswordStrength(String password) {
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[a-zA-Z0-9]*");

        if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar) {
            return "Strong";
        } else if ((hasLowercase || hasUppercase) && hasDigit) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passwordLength = 0;

        while (passwordLength <= 0) {
            try {
                System.out.print("Enter the length of the password (a positive integer): ");
                passwordLength = scanner.nextInt();

                if (passwordLength <= 0) {
                    System.out.println("Please enter a positive integer for the password length.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }

        String generatedPassword = generatePassword(passwordLength);
        String strength = getPasswordStrength(generatedPassword);

        System.out.println("Generated Password: " + generatedPassword);
        System.out.println("Password Strength: " + strength);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}



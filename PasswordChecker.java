import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        if (checkLength(password)) score++;
        if (hasUpperCase(password)) score++;
        if (hasLowerCase(password)) score++;
        if (hasDigit(password)) score++;
        if (hasSpecialChar(password)) score++;

        System.out.println("Password Strength: " + getStrength(score));
    }

    // Length check
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    // Uppercase check
    public static boolean hasUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    // Lowercase check
    public static boolean hasLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    // Digit check
    public static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    // Special character check
    public static boolean hasSpecialChar(String password) {
        String specialChars = "!@#$%^&*()-+=<>?";
        for (char c : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(c))) return true;
        }
        return false;
    }

    // Strength logic
    public static String getStrength(int score) {
        if (score <= 2) return "Weak";
        else if (score <= 4) return "Medium";
        else return "Strong";
    }
}
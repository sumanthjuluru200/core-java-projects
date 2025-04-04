package StringPrograms;

public class CharacterPercentage {

    public static void main(String[] args) {
        String input = "Java8@Rocks123!";

        int length = input.length();
        long upperCaseCount = input.chars().filter(Character::isUpperCase).count();
        long lowerCaseCount = input.chars().filter(Character::isLowerCase).count();
        long digitCount = input.chars().filter(Character::isDigit).count();
        long specialCharCount = input.chars().filter(ch -> !Character.isLetterOrDigit(ch)).count();
        System.out.printf("Upper case letters: %.2f%%\n", (upperCaseCount * 100.0) / length);
        System.out.printf("lower case letters: %.2f%%\n", (lowerCaseCount * 100.0) / length);
        System.out.printf("digits: %.2f%%\n", (digitCount * 100.0) / length);
        System.out.printf("special characters: %.2f%%\n", (specialCharCount * 100.0) / length);
    }
}

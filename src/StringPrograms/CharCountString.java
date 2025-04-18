package StringPrograms;

public class CharCountString {

    public static void main(String[] args) {
        String input = "juluru";
        char ch = 'u';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        System.out.print(count);
    }
}

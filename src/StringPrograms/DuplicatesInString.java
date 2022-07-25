package StringPrograms;

public class DuplicatesInString {

    public static void main(String[] args) {
        String inputString = "Great responsibility";
        char[] chr = inputString.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    System.out.print(chr[j] + " ");
                }
            }
        }
    }
}

package StringPrograms;

public class StringDuplicates {

    static void printDuplicates(String inputStrig) {
        int count;
        char[] charArray = inputStrig.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] != ' ') {
                    count++;
                    charArray[j] = '0';
                }
            }
            if (count > 0 && charArray[i] != '0') {
                System.out.print(charArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "aaaabbbbbccccddd";
        printDuplicates(inputString);
    }
}

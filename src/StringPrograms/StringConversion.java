package StringPrograms;

public class StringConversion {

    public static void main(String[] args) {
        String numStr = "100";
        int num = Integer.parseInt(numStr);
        System.out.println("After conversion to integer " + num);

        int strNum = 100;
        String string = String.valueOf(strNum);
        System.out.print("After conversion to string " + string);
    }
}

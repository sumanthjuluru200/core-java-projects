package BasicPrograms;

public class FactorialNum {
    static void factNum(int num) {
        int i, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        int num = 5;
        factNum(num);
    }
}

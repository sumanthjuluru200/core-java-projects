package StringPrograms;

public class StringCount {

    public static void main(String[] args) {


        String str = "sumanth messi";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)!=0){
                count ++;
            }
        }
        System.out.println("total number of char in given string "+count);
    }
}
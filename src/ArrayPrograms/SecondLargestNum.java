package ArrayPrograms;

public class SecondLargestNum {

    static int secondLargeNum(int arr[],int total){
        int temp;
        for (int i=0;i<total;i++){
            for (int j=i+1;j<total;j++){
                if (arr[i]==arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[total-2];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        System.out.println(secondLargeNum(arr,len));
    }
}

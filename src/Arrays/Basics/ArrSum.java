package Arrays.Basics;

public class ArrSum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i< arr1.length ; i++){
            sum = sum + arr1[i];
        }
        System.out.print("Sum is "+ sum);
    }

}

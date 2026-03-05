package Arrays.Basics;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10};
        int[] PrefixSum = new int[arr.length];

        //first element remains same
        PrefixSum[0] = arr[0];

        //build prefix array
        for(int i=1; i < arr.length; i++){
            PrefixSum[i]= PrefixSum[i-1] + arr[i];
        }

        //print result
        for(int i=0; i < arr.length; i++){
            System.out.println("Sum is " + arr[i] + ":" + PrefixSum[i]);
        }

        //Prefix sum from 4 to 8
        for(int i=1; i < 4; i++){
            PrefixSum[i]= PrefixSum[i-1] + arr[i];
        }
        System.out.println();

        //print result
        System.out.println("Prefix sum(4,6,8) is ");
        for(int i=1; i < 4; i++){
            System.out.println("Sum is " + arr[i] + ":" + PrefixSum[i]);
        }
        //print sum of 4,6,8
        int sum = 0;
        for(int i = 1 ; i < 4 ; i++){
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum of (4,6,8) : " + sum);
        System.out.println();

        //-------------------------------------Prefix Sum Over--------------------------------------------------//
        int L = 0;
        int R = 3;

        int Sum;
        if(L == 0){
            Sum = PrefixSum[R];
        }else {
            Sum = PrefixSum[R] - PrefixSum[L - 1];
        }
        System.out.println("Sum(using L and R) : " + Sum);
    }
}

package Arrays.Basics;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        int start = 0;
        int end = arr1.length - 1;

        while (start < end) {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i < arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }

    }
}

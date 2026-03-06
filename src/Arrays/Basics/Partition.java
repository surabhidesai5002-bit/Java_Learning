package Arrays.Basics;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 6};
        int n = arr.length;

        System.out.println();
        System.out.print("Original array -> ");

        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int L = 0;
        int R = n-1;

        while(L < R){
            while(arr[L] % 2 == 0 && L < R){
                L++;
            }
            while(arr[R] % 2 != 0 && L < R){
                R--;
            }

            if(L < R){
                int temp = arr[L];
                arr[L] = arr[R];
                arr[R] = temp;
                L++;
                R--;
            }
        }

        System.out.print("Array after swap -> ");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

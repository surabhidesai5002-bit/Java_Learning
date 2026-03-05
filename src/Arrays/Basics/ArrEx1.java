package Arrays.Basics;

public class ArrEx1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];

        for(int element : arr1 ){
            System.out.print(element + " ");
        }

        System.out.println();

        for(int i = 0; i< arr1.length ; i++){
            System.out.print(i + " ");
        }
    }
}

package Arrays.Basics.MajorityElements;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,3,2,2};
        int n = arr.length;


        System.out.print( "Array is -> ");
        for(int i = 0; i< arr.length ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Counting
        int count = 0;
        for (int i = 0; i< n ; i++){
            for(int j = 0; j< n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println("Count of " + arr[i] + " is " + count);

            //returning Majority elements
            if(count > n/2){
                System.out.println("Majority element : " + arr[i]);
                break;
            }else{
                System.out.println("No Majority Element Found");
            }
        }

    }
}

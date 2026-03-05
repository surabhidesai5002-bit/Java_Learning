package Arrays.Basics;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,5,4,7,8,1};

        int target = 9 ;
        for (int i = 0; i< arr.length ; i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found " +arr[i] + " and "+arr[j]);
                    System.out.println("Indexes " + i+ " and "+j);
                    System.out.println();
                }
            }
        }
    }
}

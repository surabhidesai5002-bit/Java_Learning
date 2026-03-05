package Arrays.Basics;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        int[][] matrix = {{2,8,9},{9,7,6}};

        for(int i = 0; i< matrix.length ; i++){
            for(int j = 0; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i =10;
        j=0;
        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
            k=i/j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception(divide by zero) Caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }catch (Exception e){
            System.out.println("Unknown Exception Occurred");
        }finally {
            System.out.println("This will get executed no matter what");
        }
        System.out.println("Hello");
    }static{
        System.out.println("Execution starts");
    }

}

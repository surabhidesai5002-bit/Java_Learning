package WrapperClasses;

//one of the best reasons why we use wrapper classes
public class WrapperDemo3 {
    public static void main(String[] args) {

        //parseInt str to integer
        String str = "123";
        int num = Integer.parseInt(str);

        System.out.println("String : " + str);
        System.out.println("Integer : " + num);

        //integer to str -> toString
        int n = 10;
        String str2 = Integer.toString(n);

        System.out.println();
        System.out.println("Number : " + n);
        System.out.println("String : " + str2);
    }

}

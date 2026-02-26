package Strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Sureha";//This is string literal
        String s2 = "Sureha";
        String s3 = new String("Sureha");
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}

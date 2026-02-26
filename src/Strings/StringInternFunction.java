package Strings;

public class StringInternFunction {
    public static void main(String[] args) {
        String s1 = new String("Book");
        String s2 = "Book";
        //String s2 = new String("Pen");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);//false
        String s3 = s1.intern();

        System.out.println(s1==s3);//false
        System.out.println(s3==s2);//true
    }
}

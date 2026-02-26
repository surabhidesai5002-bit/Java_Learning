package Strings;

public class Immutable {
    public static void main(String[] args) {
        String s1 = new String("Book");
        String s2 = new String("Book");
        System.out.println(s1);
        System.out.println(s2);
        s2 = "Bag";
        s2 = s2.concat(" Red");
        System.out.println(s2);
    }
}
package Strings;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String s1 = "Java Programming:";
        String s2 = new String("Java Programming");

        System.out.println("Original String : " + s1);

        //length
        System.out.println("Length is : " + s1.length());

        //charAt
        System.out.println("Character at index 2 : "+ s1.charAt(2));

        //toUpperCase() and toLowerCase()
        System.out.println("UPPER CASE : "+ s1.toUpperCase());
        System.out.println("lower case : " + s1.toLowerCase());

        //equals() and ==
        System.out.print("using == , s1 equals to s2 : ");
        System.out.println(s1 == s2);
        System.out.println("s1 equals to s2 : " + s1.equals(s2));

        //compareTo()
        System.out.println("using compareTo() : " + s1.compareTo(s2));

        //subString()
        System.out.println("Substring (0 to 4) : " + s1.substring(0,4));

        //contains()
        System.out.println("S1 contains Java : " + s1.contains("Java"));

        //indexof()
        System.out.println("Index of 'a' : "+ s1.indexOf('a'));

        //replace
        System.out.println("S1 before replace : " + s1);
        System.out.println("Replace Java with Python : " + s1.replace("Java" , "Python"));
        System.out.println("Again after second replace , s1 : " + s1);

        //startswith()
        System.out.println("s1 starts with java : " + s1.startsWith("java"));
        System.out.println("s1 starts with Java : " + s1.startsWith("Java"));

        //endswith()
        System.out.println("s1 ends with PROGRAMMING : " + s1.endsWith("PROGRAMMING"));
        System.out.println("s1 ends with programming : " + s1.endsWith("programming"));

        //trim
        String s3 = "         Amar      ";
        System.out.println("s3 before trim : " + s3);
        System.out.println("s3 after trim : " + s3.trim());

        //isEmpty()
        String s = "";
        System.out.println("s is empty : " + s.isEmpty());
        System.out.println("s1 is empty : " + s1.isEmpty());

        //split()
        String sentence = "This is a String Demo example";
        String[] arr = sentence.split(" ");
        System.out.println("splitted string arr is : ");
        for(String i : arr){
            System.out.print(i + "\t");
        }
    }
}

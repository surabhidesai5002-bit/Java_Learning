package OOPS.Constructor_demo;

class Student {
    String name;
    int usn;

    //original constructor
    Student(String name,int usn){
        this.name = name;
        this .usn = usn;
    }
    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.usn = s.usn;
    }
    //methods
    void display(){
        System.out.println("Student name is "+ name + "\nStudent usn is "+ usn);
    }
}
//main class
class Main{
    static void main() {
        Student s1 = new Student("Sourabh",123);
        Student s2 = new Student(s1);
        Student s3 = s1;
        s1.display();
        s2.display();
        s3.display();
    }
}

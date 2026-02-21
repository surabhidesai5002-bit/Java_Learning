package OOPS.cls_with_attributes;

public class Chocolate {
    String brand;
    double price;
    double weight;

    Chocolate(String Bname, double Price, double Weight){
        brand = Bname;
        price = Price;
        weight = Weight;
    }
    void displayDetails(){
        System.out.println("Chocolate Brand Name is " + brand);
        System.out.println("Chocolate Price is " + price);
        System.out.println("Chocolate weight is " + weight);
        System.out.println();
    }
}
class Choco{
    public static void main() {
        Chocolate Kk = new Chocolate("Kitkat",10.0,25);
        Chocolate m = new Chocolate("Munch",20.0,15);
        Kk.displayDetails();
        m.displayDetails();
    }
}

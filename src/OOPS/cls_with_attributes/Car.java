package OOPS.cls_with_attributes;

public class Car {
    String BrandName;
    int ManuDate;
    String Color;

    Car(String BrandName,int ManuDate,String Color ){
        this.BrandName = BrandName;
        this.Color = Color;
        this.ManuDate = ManuDate;
    }
    void PrintDetails(){
        System.out.printf("Car Brand Name is %s",BrandName);
        System.out.println();
        System.out.printf("Car Manufacturing Date is %d",ManuDate);
        System.out.println();
        System.out.printf("Car color is %s ",Color);
        System.out.println();
    }
}
class Driver{
    public static void main() {
        Car c1 = new Car("Audi",2000,"Red");
        Car c2 = new Car("BMW",2010,"Black");
        c1.PrintDetails();
        c2.PrintDetails();
    }
}

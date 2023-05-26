package javaders.day25varargsinheritance;

public class Car extends Vehicle {
    public Car() {
        this("make");//Ayni class icerisinde constructor cagirmak icin kullanilir(parametresi String olan constructora gitti)
        System.out.println("Car1");
    }

    public Car(String make) {
        super();//  burada parametresiz parent constructor.a git diyoruz
        System.out.println("Car string parametreli");
    }
    public String model="car model";
    public int km=20000;
}

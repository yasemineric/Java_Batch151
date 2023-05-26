package introduction.day03scanner;

public class Car {
    // Variable.lar olusturalim
    public String model = "Corolla";
    public int price = 20000;

    // Methodlar olusturalim
    // Return type Void oldugunda method icine return keywordu kullanmiyoruz.
    // eger bit method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa return type.i void olur.


    public void bewegung() {
        System.out.println("Corolla bewegt sich schnell");

    }

    public void stop() {
        System.out.println("Corolla stoppt sicherlich");

    }
}

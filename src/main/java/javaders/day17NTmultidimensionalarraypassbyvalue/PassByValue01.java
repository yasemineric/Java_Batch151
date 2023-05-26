package javaders.day17NTmultidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
    Method olusturmak icin asagidaki 5 adimi takip edin;
    1) Access Modifier
    2)Return Tyoe
    3)Method Ismi
    4)Method Parantezi
    5) Method Body.si

     Note: Main Method.un icindeki tum methodlar static olmalidir.
           Bir Methodu static yapmak icin Access Modifier ile return Type arasina static yazmak yeterlidir.

      PassByValue:
       1)Java Pass by Value kullanir.
       2)Java Methodlarin orijinal degeri degistirmesine musade etmez
       3) Java methodlara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi method.a yollar.
         Method o kopya deger üzerinde degisiklik yapar, böylece orijinal deger korunmus olur.
       4)Java esnek bir dildir.Istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebiliriz.


     Pass by Reference:
        1)Pass by Reference da method.a reference yollanir.
        2)Reference adres demektir. Adres yollaninca method adresi kullanarak orijinal degere ulasir ve orijinal degeri degistirir.
         Bu yuzden C# gibi Pss by Reference kullanan dillerde method variable.in orijinal degerini degistirir.



     */
    public static void main(String[] args) {

    int shirtPrice=200;// Burada java ana deger bozulmasin diye kopya 200.ü alir, discount method.unun icine kopyayi gönderir.
        System.out.println(discount("student",shirtPrice));// Burada java.ya discount methodunu bul ve type ögrenci icin yeni fiyati getir diyoruz.
        System.out.println(shirtPrice);// indirim yaptigimiz halde orijinal deger korunuyor. Buna PassByValue denir.

    }//main

    //Discount Method.u olusturunuz.
    public static int discount(String type, int price){
        switch(type){
            case "student":
                price=price-20;
                break;
            case "veteran":// gazi
                price=price-40;
                break;
            case "senior":
                price=price-30;
                break;
            default:
                price=price;
        }
  return price;
    }


}//class

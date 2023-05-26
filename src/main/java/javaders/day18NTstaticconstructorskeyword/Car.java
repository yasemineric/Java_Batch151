package javaders.day18NTstaticconstructorskeyword;

public class Car {
    String make="Honda";
    String model="Accord";
    int year=2021;
    int price=18000;

    //DEfalut Constructor
    // Her class oluşturulduğunda Java otomatik olarak bir Constructor oluşturur, bu Constructor'a default constructor denir
    //Default Constructorlar parametre kullanmaz.
    //Default Constructor.larin body.sinin icin bostur.
    //Java kiskanctir. Siz default Constructori el ile yazdiginizda
    // Java, object Class icindeki default Constructor.i kullandirtmaz
    // --Biz bir class'da Constructor oluşturduğumuzda, Java default constructor'i iptal eder
    // Constructor'lar bir class'dan yeni bir obje oluşturmak için kullanılır.

  /*
    1)Constructor nasil olusturulur?

    Access Modifier+Class ismi+ () +{}
2)Method ile Constructor arasindaki farklar nelerdir?
    i)"Method" larda return type olur,Constructor larda olmaz.
    ii)Methodlar yaptiklari ise göre isimlendirirler (örnegin toplama methodu deriz.)
    Constructor lar ise her zaman class ismi ile isimlendirilirler.
    iii)Methodlar bir aksiyon yapmak icin olusturulur.Constructor lar ise Object olusturmak icin olusturulur.
            iv)Method isimleri kücük harfle baslar Constructor isimleri class ismiyle ayni oldugu icin büyük harfle baslar.
            3) Parametreli Constructor lar olusturarak ayni class tan farkli özelliklere sahip objeler olusturabiliriz.

   */

    public Car(){

    }

    // Custom Constructor(kendimiz olusturdugumuz)
    public Car(String make, String model, int year, int price){
        this.make=make;
        this.make=model;
        this.year=year;
        this.price=price;

    }

    //Custom Constructor
    public Car(String make){
        this.make=make;

    }
    //bır classçın ıcınde bırden fayla constructor olablır


}

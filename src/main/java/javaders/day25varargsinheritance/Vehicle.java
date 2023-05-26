package javaders.day25varargsinheritance;

public class Vehicle {
    /*
    1)Javada Object Class tum java class'larinin ortak parentidir
    2)Javada Object Class haric tum class'larin parent'i vardir
    3)Javada Parent'tan child'a olan iliskilere HAS A Relation Ship denir
    4)Javada child'dan parent'a olan iliskilere IS A Relation Ship denir
    Bu default constructor class'in icinde gorunmez cunku, default constructor Object Class'in icindedir
    5) Child class'tan bir object olusturdugumuzda Canstructorlar en
       ustteki parent class dan baslatilarak alta dogru calistirilir
    6)Child Class'daki constructordan parent classdaki constructor'a
       gidebilmek icin super() kullanilir
    7)Parent classda birden fazla constructor varsa istenilen constructor super()
      ifadesinin icine yazilan parametreler yardimi ile secilebilir
    8)Ayni class icinde constructorlari secmek icin this() kullanilir
      Ayni classta birden fazla constructor varsa istenilen constructor this()
      parantezinin icine yazilan parametreler yardimi ile secilebilir
    9) super() ifadesini yazmak istege baglidir. Siz yazmasanizdajava sanki super()
       varmis gibi davranir. Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir
    10) super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
    11)Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir
       bakiniz 10. madde
    12) Inheritance da variable lari ve methodlari cagirmak icin this veya super kullanilir
         this==> kendi class'indan
         super==> parent class'indan variable yada method cagırmayi saglar

          */


    public Vehicle() {
        this(5);
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {
        System.out.println("Vehicle int parametreli");
    }


}

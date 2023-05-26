package javaders.day27interface;

/*
             Interface.deki Methodlar
      1)Interface icine concrete Method konulamaz
      2)Interface icindeki methodlarin abstract oldugunu java bilir bu yüzden
        "interface" icindeki "abstract methodlarda" "abstract" keyword kullanmaya gerek yok
      3)"Interface" icindeki "abstract methodlarin tamami "public" dir.
        Bu yüzden "Interface" icinde abstract method olustururken access modifiere yazmaya gerek yoktur
      4)Bir Interface.i bir "class"in Parenti. yapmak istediginizde extends keyword yerine "implement" keyword
        kullanilir.
      5)"Concrete child Class"lar Parent Interface.deki  abstract methodlari override etmek zorundadirlar.
      6)Interface.ler bir application da Concrete Child Class.larin yapmak zorunda olduklari fonksiyonlari barindirirlar
        Bu yüzden Interface.lere To-Do-List de denir.
      7)Birden fazla Parent Interface icinde ayni isimli abstract methodlar olusturabilirsiniz(Ama bu yinede pek tavsiye edilmez)
        Abstract methodlarin body.si olmadigi icin child class.lar ayni isimli methodlardan herhangi
        birini override ederek kullanabilirler.
      8)Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda
        bu method'larin "return type"lari ayni olmak zorundadir.
      9) Normalde interface icinde concret method konulamaz, ama bazi özel durumlarda concrete method koymamiz gerekirse:
          i)"default" keyword.unu asagidaki gibi kullanarak interface icine concrete method koyabiliriz.
          default void eco(){ System.out.println("Uses gas less...");}
          ii)"static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
          koyabiliriz. static void stop () { System.out.println("Stop securely...");}
      10)"default" ve "static" keyword kullanilarak olusturdugumuz methodlarin concrete child class
         tarafindan kullanilma zorunlulugu yoktur.
      11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
         ulasilabilir.
         "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
         olusturmaya gerek yoktur, "interface" ismi yeterlidir.
      12) Interface-lerden object olusturulamaz.Interfaceler.in constructor.i yoktur



 */

public interface Engine {
   void start();

   void payment();

   default void eco(){// buradaki default keyword aceess modifier degil, sadece concrete method olusturmak icin.
      System.out.println("Uses gas less...");
   }
   static void stop(){
      System.out.println("Stops securely...");
   }

}

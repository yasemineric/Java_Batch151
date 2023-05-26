package javaders.day26polymorphism;

public class Animal {
     /*1) Parent Classdaki methodu Child class icinde ozellestirerek kullanmaya overriding yapmak denir
      2) Overriding de methodun parantezine ve methodu ismine dokunulmaz, (==>Method signature)
      3) private methodlar override edilemezler
      4) Child classdaki methodun acces modifieri parent tan daha dar olamaz
      5)Child class da override edilen methodun return tye i ile Parent taki methodun return type i arasinda
      IS-A iliskisi varsa return type degistirelebilir
      6)Methodun return type i primitive ise Overriding yaparken primitive type degistirilemez. Cunku return type
      ya ayni olur yada parent tan secilir, ama primitiveler arasinda parent-child iliskisi olmadigindan parent tan
      secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir
      7)Child'da override edilen methodun return type i ile parent taki methodun return type i arasinda
      IS-A ilisikis yoksa return type DEGİSTİRİLEMEZ
      Mesela ;
      Integer Wrapper classi ile Long Wrapper classi arasinda IS-A iliskisi yoktur o yuzden return type i
      degistiremedik
      8)Methodun return type i void ise Overriding yaparken return type DEGISTIRILEMEZ
      9)Static Methodlar override edilemezler. Cünkü Static Methodlar tüm child.lar icin ortak methodlardir.
      Bir Child bir ortak Method.u degistirdiginde, diger child.lar bundan olumsuz etkilenenebilir.
      Bu yüzden java static method.larin override edilmesine izin vermez.
      10)final methodlar override edilemezler. final methodlarin body si degistirilemez ama Override ederken
      method body i degistiririz bu bir celiskidir. Bu yuzden java final methodlarin override edilmesine musade etmez
               a) Final keyword unu Variable lar ile kullanabiliriz
                    i)final variable ise mutlaka deger atanmalıdır
                    ii) ilk atanan deger degistirilmez

               b) Final keyword unu Method lar ile kullanabiliriz
                    i)method final ise methodun body si degistirilemez
                    ii) methodun body si degistiriemeyince override yapmak mumkun olmaz

               c) Final keyword unu Class lar ile kullanabiliriz
                    => class final ise O classin child i olamaz

      ==> Polymorphism==> Method Overloading+ Method Overriding;
    */

    public void eat(){// burasi Private olmaz,  cunku override edemeyiz
        System.out.println("Animals eat");
    }
    public void trink(){
        System.out.println("Animals trink");
    }
    public Animal create(){
        return new Animal();
    }
    public  int add(int a, int b){
        return a+b;
    }
    public Integer multiply(int a, int b){
        return a*b;
    }

    public final double circleArea(double r){// final yazdigimizda, bu method child.dan override edilemez
        return 3.14*r*r;
    }


    final Integer a=13;// Final bir variable.la birlikte kullaniliyorsa mutlaka bir deger atanmasi lazim.
    final double PI=3.14; //PI=3.15; yapmak istersek uyari verir, degistirtmez




}

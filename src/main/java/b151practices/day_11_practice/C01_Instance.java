package b151practices.day_11_practice;


public class C01_Instance {
             /*
    sayi, isim, ogrenciMi seklinde üc tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım
*/

    int sayi;// 0
    String isim;// null
    boolean ogrenciMi;// false

    public static void main(String[] args) {
        //Instance variable.lara static bir method icerisinden ulasmak icin obje olusturmamiz lazim.
        C01_Instance obj1= new C01_Instance();
        System.out.println(obj1.sayi);
        System.out.println(obj1.isim);
        System.out.println(obj1.ogrenciMi);

        //////////////////////////////////

        C01_Instance obj2= new C01_Instance();

        obj1.isim="Hasan";
        obj2.isim="Hüseyin";

        System.out.println(obj1.isim);//Hasan
        System.out.println(obj2.isim);//Hüseyin

        obj1.sayi=20;
        obj2.sayi=25;

        System.out.println(obj1.sayi);//20
        System.out.println(obj2.sayi);//25

        //instance variable.lar obje.ye baglidir
        //hangi obje üzerinden degisiklik yapildiysa, yapilan bu degisiklik sadece o obje.yi baglar.





    }




}

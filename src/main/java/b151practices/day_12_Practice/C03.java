package b151practices.day_12_Practice;

public class C03 {
    // Intance Variable.lar obje.ye baglidirlar.
    // Hangi obje üzerinden degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.

    int fiyat=300000;
    int yil=2023;
    String marka="Opel";

    public C03(int fiyat, int yil, String marka) {
        // Constructor.in ismi class ismi ile ayni olmali, constructor.in return type.i olmaz
        this.fiyat=fiyat;
        this.yil=yil;
        this.marka=marka;


    }

    public C03() {

    }


    public static void main(String[] args) {

        C03 obj1=new C03();// Parametresiz constructor var, önce class icine bi gider default constructor.a ugrar.
        // Orada da herhangi bir deger atamasi olmadigi icin aynen geri gelir, default degerlerini yazdirir.
        System.out.println(obj1.fiyat);//300000
        System.out.println(obj1.yil-3);//2020
        System.out.println(obj1.marka.replace("Opel", "Mercedes"));//Mercedes

        C03 obj2=new C03(500000, 2021, "Citroen");
        // parametreli bir constructor olusturunca üstteki obj1.deki C03 kizardi,
        // cünkü onun gittigi default constructor öldü, bunun yerine ayni görevi yapan
        // parametresiz constructor olusturayim mi diye sorar java, ve olusturdugumuzda hata giderilir.
        System.out.println(obj2.fiyat+", "+obj2.yil+", "+obj2.marka);//500000, 2021, Citroen


        /*
        obj1'i olusturdugumuzda main method disinda bir constructor olusturmadik.
        Ilk objemiz parametresiz olup main method disinda bir constructor olmadigindan,
        javanin bizim icin olusturdugu parametresiz gorunmeyen default constructordan faydalandik.
        Default constructor objemiz ile calisti, daha sonra tekrar main method
        icine girdik ve sout icinde ne yazdiysak onlari calistirmis olduk.
        Sout icinde objemizin ismi ile ilgili instance variablein ismini yazdik
        ya da ilgili variable ismi yaninda eksiltme ya da replace methodu ile degisim yapip yazdirdik.

        Ikinci objemiz ile ilgili olarak; Elimizde uc tane instance variableimiz var.
        Ikinci objemizi parametreli olarak olusturduk, boylece instance variablelarimiza yeni degerler verdik.
        Parametreli obje oldugu ve main method disinda parametreli bir constructorimiz olmadigi icin
         ihtiyacimiz olan constructor'i olusturduk.
        Constructor'in body'si icinde sirasiyla instance variablarimizin isimlerini this keywordu ile alt alta yazdik.
        this yanina yazdigimiz isimler instance variablelara ait iken = karsindaki isimler constructor
        icindeki parametreleri temsil eder. Ikinci objemizde verdigimiz degerler, constructor parametrelerini
        degistirir. Objelere bagli olan instance variablelar bu yontemle deger degisikligine ugrarlar
         ve guncellenen degerleri ile yazdirilirlar.
         */




    }



}

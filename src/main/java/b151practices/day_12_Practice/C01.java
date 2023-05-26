package b151practices.day_12_Practice;

public class C01 {

    String isim="Hasim";// Instance variable--Class seviyesinde- Main method disinda-- Objeye baglidirlar.
    int yas=20;// Instance variable--Class seviyesinde- Main method disinda--Objeye baglidirlar.

    public C01(String isim, int yas){// parametreli Constructor icerisine bir deger atamasi yapalim;
        // nuri ve 25.i yazdirabilmek icin(this.isim=isim;this.yas=yas;).
        // Bu atamayi yapmazsak degerler yine Hasim, 20 olarak kalir.
        this.isim=isim;
        this.yas=yas;

    }

    public C01(){// Parametresiz Constructor

    }


    public static void main(String[] args) {
        C01 obj1=new C01( "Nuri", 25);// Bu parametreli bir objedir ve
        // yukarida parametreli Constructor.a gider.
        // this.isim=isim;this.yas=yas; atamalari yaparsak yeni degerlerimizi yazdiririz.
        System.out.println(obj1.isim+ ", "+obj1.yas); //Nuri, 25

        C01 obj2=new C01(); // Parametresiz obje olusturduk. Parametresiz oldugu icin
        // normalde default constructor.i calistiracak
        //Ama biz kendimiz constructor olusturdugumuz icin default constructor yok, öldü.
        //O yüzden parametresiz constructor.a gidecek, orada da herhangi bir deger yok.
        //Bu nedenle  obj2, normal instace variable.in default degerlerini yazdirir.
        System.out.println(obj2.isim+ ", "+obj2.yas);//Hasim, 20

        //Her Class'da default constructor vardir.
        // Fakat biz bulundugumuz Class'da kendimiz bir constructor olusturursak bu durumda
        // "default constructor" ölür(silinir)
        //instance variablelar Object.ye; Static variablelar Class a baglidir







    }








}







package b151practices.day_12_Practice;

public class C02 {
    String isim;
    int yas;
    String telefon;

    public C02(String isim, int yas, String telefon) {
        this.isim=isim;
        this.yas=yas;


    }


    public static void main(String[] args) {

        C02 obj1=new C02("Burak", 32, "0246");// objeyi girip parametreler girince java altini kirmizi cizer,
        // ve paarmetreli constructor olusturayim mi der, olusturunca default constructor ölür.

        System.out.println(obj1.isim+", "+obj1.yas+", "+obj1.telefon);//Burak, 32, null+





    }



}

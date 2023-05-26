package b151practices.day_11_practice;

public class C02_Static {
     /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
*/

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;




    public static void main(String[] args) {
        //static variable.lara class icerisindeki tüm methodlardan direkt ulasabiliriz.
        //static variab.lara baska class.tan  mevcut classIsmi. yaparak class ismi ile cagiririz.

        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);// 0
        System.out.println(okulAcikMi);//false

        /////////////////////////////////////////////////////

        //Static variable.lar gökteki ay gibidir.
        //Static variable.lar class.a baglidir.
        //Sattic variable.in degeri bir kisi tarafindan degistirilirse, herkes icin degisiklige ugrar.
        okulNo=102;
        System.out.println(okulNo);//102


        staticMethod();// burada method.u call. ettik
        System.out.println(okulNo);//200


    }

    private static void staticMethod() {// burada static.i kaldirirsak hata verir.
        okulNo=200;
        System.out.println(okulNo);//200
    }


}

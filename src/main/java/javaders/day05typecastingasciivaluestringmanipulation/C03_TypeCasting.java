package javaders.day05typecastingasciivaluestringmanipulation;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*
        Nümerik Data Type.larinin birbirine dönusturulmesine Type Casting denir
        Numeric Data Type: byte<short<int<long<float<double

        Kucuk Data Type.larinin Büyük data type.lerine dönustururlmasine
        Autowidening denir(Otomatok genisletme)==> Kücük kutunun buyuk kutu icerisine yerlestirilmesi

        Buyuk kutunun Kucuk kutuya dönusturulmesinde Java sorumlulugu kabul etmez.
        Data kaybi olabilecei icin code.u yazanlara birakir. Buna Explicit Narrowing denir.
        (Aciktan Daraltma ) denir
         */
        byte age=13;
        int ageInt=age;// AutoWidening(Otomatik genisletme)

        long lohn =12134654765465L;
        short newLohn= (short)lohn;// Explicit Narrowing(Aciktan Daraltma )

        int yas=48;
        float yasFloat= yas;//AutoWidening(Otomatik genisletme)

        float num1=2.55f;
        int num1Int= (int) num1;







    }//main
}//class

package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

 // ************ Explicit Narrowing ***********

        /*
        Explicit Narrowing yaparken cok dikkat edilmeli
        cunku cok ciddi =data kaybina neden olabilir.
        Eger donusturmeye calistigimiz Variable.in sinirlari disinda ise Java
        sayiyi mod islemine alir ve kalani yazdirir.
        Kalan bolenin yarisindan fazla ise kalan sayiyi Java kucultmek ister
        ve bolumu bir arttirarak kalani _ isaretli  olarak yazdirir.

         */
        short num=260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);//4

        short num2=1023;
        byte num2Byte= (byte) num2; // -1
        System.out.println("num2Byte = " + num2Byte);

        int intSayi=8880;
        short shortSayi= (short) intSayi;
        System.out.println("shortSayi = " + shortSayi);









    }//main
}// class

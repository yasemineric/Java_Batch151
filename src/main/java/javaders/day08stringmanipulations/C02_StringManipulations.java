package javaders.day08stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {

        //***************** replaceFirst()*****************
        /*
        replace() ayni isi yapiyor, ancak ilk gördugu datayi degistiriyor

         */
        String str= "Hayirli Olsunda ";
        //String str1= str.replaceFirst("a","e"); // her zaman konteynera atmak daha makbul
        //System.out.println(str1);               // her ne kadar satir sayisi artsa da. ileride bi degisiklik oldugunda sout icinde veri aramaya gerek kalmadan konteyner icinde degisikli yapariz

        System.out.println(str.replaceFirst("a", "e"));

        // ********************* trim(uclarindan aldirmak)~~~~~~~~~~+
        // Bir stringdeki basinda ve sonundaki space karakterlerini siler.Aradaki spacelere dokunmaz

        //Ex: str String.indeki bas ve sonda varsa space karakterlerini silinizz

        String str2 = "     Ali Can     ";
        System.out.print(str2);
        System.out.println("*****");
        String strTrim= str2.trim();
        System.out.print("strTrim = " + strTrim);
        System.out.println("*****");

        // Ex: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv=599.99$ String laptop =299.99$
        String tv="599.99$";
        String laptop ="299.99$";
        String tv2=tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        String laptop2=laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);
        // Simdi toplamaya cakisirsak concatination olur, yan yana yazdiririr


        Double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);
        /*
        valueOf()methodu; String olan datayi sayi haline getirir.
         */
        // Ex: Verilen ismin ilk isminin ilk harfi v esoy isminin ilk harfini ekrana yazdiriniz

        /*String tamIsim ="  mehmet Fatih  ";// ==> MF
        char first = tamIsim.trim().toUpperCase().charAt(0);//M
        System.out.println("first = " + first);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);//F. Burada [1] ikinci kisim Fatih.i temsil eder.[0] yazsaydik Mehmet kismini alirdi
        System.out.println("second = " + second);
        System.out.println(" Ilk Harf Son Harf : "+ first+second);

         */

        String str3= "   mehmet fatih yildirim";
        char first = str3.trim().toUpperCase().charAt(0);
        char second =str3.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" Ilk harf son harf: "+first+second+third);



    }//main
}//class

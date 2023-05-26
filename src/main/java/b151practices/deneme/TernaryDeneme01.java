package b151practices.deneme;

public class TernaryDeneme01 {
    public static void main(String[] args) {

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */

        String password= "a1b2c3  25";
        String gultig=password.replace(" ","").length()>7?"Gultige Password":"Ungultige Password";
        System.out.println(gultig);

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen
         */

        int a=3;
        int b=3;
        int c=3;
        String varyOfTriangle=a==b&&b!=c||a==c&&c!=b||c==b&&c!=a?"İkizkenar Üçgen":(a==b&&b==c)?
                "Eşkenar Üçgen":"Çeşit Kenar Üçgen";
        System.out.println(varyOfTriangle);


        /*Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondaliğa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

         */

        int num=126;
       int lastDigit=num%10;
        String yuvarlama= lastDigit>=5?("Son basamağı bir üst ondaliğa yuvarla:"+(num/10+1)*10):"Son basamağı bir alt ondalığa yuvarla:"+(num/10)*10;
        System.out.println(yuvarlama);


        /*
        Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir
         */

        int year=1600;
        String istLeapYear=(year%100==0)?((year%400==0)?("Leap Year"):("Not Leap Year")):((year%4==0?("Leap Year"):("Not Leap Year")));
        System.out.println(istLeapYear);


        /*
        Nested Ternary kullanarak;
         Şifreyi kontrol etmek için kodu yazınız.
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

         */
        String pass="ixxxxxxxxx";
        int passL=pass.length();
        String basharf= (passL>8)?((pass.startsWith("i")?"Gültig":"Nicht Gültig")):((pass.startsWith("K")?"Gültig":"Nicht Gültig"));
        System.out.println(basharf);

            /*
          Bir sayının mutlak değerini hesaplamak için kodu yazınız.
          Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
          Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
          */
        int i=-65;
        int mutlak= i>=0?i:i*-1;
        System.out.println("mutlak = " + mutlak);

        //Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız
        int num1=15;
        int num2=10;
        int kck= num1<num2?num1:num2;
        System.out.println("kck = " + kck);

        /*
        Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
kodunuz " Bu sayı 3 basamaklı değildir" olacaktır
         */

        int num3=-120;
        String basamak= (99<num3 && num3<1000)||(-99>num3 && num3>-1000)?"Bu sayı 3 basamaklıdır":" Bu sayı 3 basamaklı değildir";
        System.out.println("basamak = " + basamak);

//Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız
        int num4=6;
        String tc= num4%2==0?"Cift":"Tek";
        System.out.println("tc = " + tc);

       /* Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
                Örnek: 2000 yılının Şubat ayında gün sayısı 29

        */
        int jahr=2000;
        int monat=2;
        int tag=0;
        switch(monat){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                tag=31;
                break;
            case 4: case 6: case 9: case 11:
                tag=30;
                break;
            case 2:
                if (((jahr % 4 == 0) && !( jahr% 100 == 0)) || (jahr % 400 == 0)) {
                    tag= 29;
                }else {
                    tag = 28;
                }
                break;

            default:
                System.out.println("Ungültiger Monat");
                break;
        }
        System.out.println("tag = " + tag);

    }
}

package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

        // INTERWIEW Questions USA QA
        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz

        // String y="abbccdc";


        String y="abbccdc";// ad
        char ch= y.charAt(0);
        if(y.indexOf(ch) == y.lastIndexOf(ch)){
            System.out.println(ch);
        }// if bady: iki curly braces arasi
        char ch1= y.charAt(1);
        if(y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2= y.charAt(2);
        if(y.indexOf(ch2) == y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3= y.charAt(3);
        if(y.indexOf(ch3) == y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
        char ch4= y.charAt(4);
        if(y.indexOf(ch4) == y.lastIndexOf(ch4)){
            System.out.println(ch4);
        }
        char ch5= y.charAt(5);
        if(y.indexOf(ch5) == y.lastIndexOf(ch5)){
            System.out.println(ch5);
        }
        char ch6= y.charAt(6);
        if(y.indexOf(ch6) == y.lastIndexOf(ch6)){
            System.out.println(ch6);
        }

        // Ex: Verilen sayi pozitif ise ekrana pozif oldugunu yazdirin

        int num= 65;
        if(num>0){
            System.out.println("Die Zahl ist Positive");
        }

        int num1=-35;
        if(num1>0){
            System.out.println("Die Zahl ist Positive");}
        else if (num<0) {System.out.println("Die Zahl ist Positive");

        }

        // Sayi -1 ile 10 arasinda ise ekrana verilen data rakamdir yazdiran kodu yaziniz

        int num3= 15;
        if(num3>-1 && num3<10){
            System.out.println("Verilen Data Rakamdir");
        }
        else{
            System.out.println("Verilen Data Rakam degildir");
        }

        // Sayi 3 basamakli ise ekrana verilen Data uc basamaklidir yazdiran kodu yaziniz

        int num4=-33;
       num4 =Math.abs(num4);
        if(num4>99 && num4<1000){
            System.out.println("Verilen Data 3 basamaklidir");

        }


    }//main
}//class

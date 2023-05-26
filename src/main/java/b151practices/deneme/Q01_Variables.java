package b151practices.deneme;

public class Q01_Variables {
    public static void main(String[] args) {
        //Initialise Variable
        // Bir Variable baslat.Once Data Type+ismi= Atama Yapacagimiz deger
        int age = 32;
        int number = 55;
        String name = "Ali";


        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("name = " + name);

        // Variable degerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String hisName = name;
        System.out.println("hisName = " + name);

        //Ayni satirda coklu Variable deklare etme
        int year = 2022, month=7, day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println("day = " + day);

        //bir Varianle degerini güncelle
        year= 2023;
        System.out.println("year = " + year);
        year=2030;
        System.out.println("year = " + year);

       //Bir variable deklere et : x
        double x;
        //Bir variable başlat : y
        double y=55.6;
        //Başka bir variable başlat : z
        double z=10;
        //x değişkenini y değişkeni ile başlat
        x=y;
        //Variable'i güncelle
       x=15.3;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}

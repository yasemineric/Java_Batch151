package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {


    /*
       javada method nasil olusturulur

       1)main method'un disinda olusturulur
       2)Access Modifier + return type + Method ismi+ () + {}

       Olusturulan methadlar nasil kullanilir?
       1)main method'un icinden kullanilir
       2)methodun ismi + () yazin
       3)islem yapacağınız parametreler parantezin icine koyulur
       ==>main method static oldugu icin main method icerisinde kullanacağınız her sey static olmalidir.
        */
    public static void main(String[] args) {

        int sonuc = toplamaYap(30, 60);
        System.out.println(sonuc);

        long carpmaSonuc = multiply(3, 5);
        System.out.println(carpmaSonuc);

        int ucluSonuc=firstTwoMultiplyThirAdd(2,5,8);
        System.out.println(ucluSonuc);

        double kupSonuc= getCube(0.15);
        System.out.println(kupSonuc);

        print ("Hello World");



    }

    //Ornek1:toplama islemi yapan bir method olusturunuz.
    public static int toplamaYap(int a, int b) {
        return a + b;
    }

    //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
    protected static long multiply(int a, int b) {
        return a * b;
    }
    private static int firstTwoMultiplyThirAdd(int a, int b,int c) {
        return a * b + c;

    }

    static double getCube( double a){
        return a*a*a;

    }



    //ornek5: girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    // return type void oldugunda return keyword kullanilmaz
    public static void print(String str){
        System.out.println(str);
    }
}

//Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.

//ornek4 : verilen ondalikli sayinin küpünü hesaplayan
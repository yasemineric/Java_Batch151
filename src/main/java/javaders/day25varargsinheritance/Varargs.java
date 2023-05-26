package javaders.day25varargsinheritance;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(3, 6));
        System.out.println(add(5, 2, 7, 9, 15, 5));
    }
    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir.public static int add(int b,int... a )


    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {// tipki array.lerdeki gibi toplama yapiyoruz
            sum = sum + w;
        }
        return sum;
    }
    //toplama islemi yapan bir method olusturun
    // Asagidaki gibi fakli methodlari olusturarrak dynamic cozum uretemeyiz
    //Cunku kullanici herzaman farkli sayidaki sayilari toplamak isteyebilir.
    //Her ihtimal icin bir method olusturmak mumkun degildir.
    //Java farli sayidaki parametrelerini hepsini kabul eden bir yapi olusturdu
    // bu yapiya Varargs denir
    // Varargs arka planda array yapisini kullanir.

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //Example :   Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //    //            Ali Can ==> AC    Kemal Han ==> KH
    public static void getInitials(String... s) {
        String initials="";
        for (String w:s) {
            initials=initials+w.charAt(0)+ w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";// her döngüde icine yeni bir isim geldiginde, gecmisteki de konteyner.da bulunmasin diye sifirliyoruz
        }

    }


}

package b151practices.MentorTeam.OverLoading_OverRiding;

public class Main {
    public static void main(String args[]){
        B obj2 = new B();
        obj2.i = 1;
        obj2.j = 2;
        A r = obj2;
        r.display();
        //((A) obj2).display();
        //System.out.println(r.j);
        //System.out.println(r.i);

        StringBuilder sb = new StringBuilder("StringBuilder");
        System.out.println(sb.delete(3, 6) + " - " + sb.length());

        final int MAX_VALUE = 100;
         int x;



       //Java programlama dilinde, final değişkenleri (constant variables) isimlendirirken
        // büyük harf kullanımı zorunlu değildir, ancak standart uygulama, final değişkenlerinin tüm harflerini büyük
        // harfle yazmaktır. Birden fazla kelime kullanılırsa, kelime başları büyük harfle yazılır
        // ve kelimeler arasına boşluk yerleştirilir.

        //final bir değişkenin tanımlanması sırasında, o değişkene bir değer atanmalıdır.


        /*
        Compile-time polymorphism, programın hızlı ve verimli çalışmasına yardımcı olabilir,
        çünkü hangi metotların çağrılacağı derleme zamanında belirlenir ve kod çalıştırılmadan önce belirlenir.
        Bu nedenle, programın çalışması sırasında herhangi bir karar verme işlemine ihtiyaç duyulmaz,
        bu da programın daha hızlı ve daha verimli çalışmasına katkıda bulunabilir.
         */


        /*
        Runtime polymorphism, kodun daha esnek ve yeniden kullanılabilir olmasını sağlar.
        Özellikle nesne yönelimli programlama paradigmalarında, bir nesnenin türünden bağımsız olarak belirli
         bir davranışı göstermesi gereken durumlarda sıklıkla kullanılır. Bu sayede kod, daha az sınıf ve daha
         az kod tekrarıyla daha esnek hale getirilebilir. Ancak, çalışma zamanında metot çağrısının belirlenmesi,
          programın çalışması sırasında biraz daha yavaşlamasına neden olabilir.
         */





    }


    public static void m4(int i, String ...t) {
        System.out.println(t.length);
    }
}

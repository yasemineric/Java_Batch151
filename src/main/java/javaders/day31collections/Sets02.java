package javaders.day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        //1.yol;
        long t1=System.nanoTime();

        TreeSet<String > emails= new TreeSet<>();// Burada her eleman eklemede siralama yapiyor ve yavasliyor.
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("g@gmail.com");
        emails.add("x@gmail.com");
        emails.add("e@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]

        long t2=System.nanoTime();


        //2.yol;Recommended--Cok daha hizli calisir.
        // Önce cuvala atar gibi tüm email adreslerini rastgele aliyor, sonra TreeSet.e alinca tek bir siralama yapiyor
        HashSet<String> emailsHS= new HashSet<>();
        emailsHS.add("a@gmail.com");
        emailsHS.add("t@gmail.com");
        emailsHS.add("g@gmail.com");
        emailsHS.add("x@gmail.com");
        emailsHS.add("e@gmail.com");
        emailsHS.add("b@gmail.com");
        emailsHS.add("c@gmail.com");
        TreeSet<String > emailsTS= new TreeSet<>(emailsHS);// HashSt Variable.ni TreeSet Consructor.in icine koyarsak, natural order.a göre cevirdi
        System.out.println(emailsTS);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]

        long t3=System.nanoTime();

        System.out.println(t2-t1);//1359600-- TreeSet.in calisma süresi
        System.out.println(t3-t2);//125700-- HashSet Calisma süresü






    }

}

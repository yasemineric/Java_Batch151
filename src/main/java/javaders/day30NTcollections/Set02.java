package javaders.day30NTcollections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
       //Example 1 :Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        //1.Yol:
        TreeSet<String>emails=new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);

        //2Yol:1.yol.a göre daha hizli calisir.Once hashset ile hizli bir sekilde elemanlari ekliyoruz, sonra da treeset.e gecirip siralatiyoruz.
        //HashSet benzersiz olduğu için öncelikle hashSet içine koyarız,sonra bunu treeSet e dönüştürürüz.
        //Böylece HashSet'in hızından faydalandıktan sonra TreeSet ile sıraya dizeriz.
        HashSet<String> emailsHs=new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");
        System.out.println(emailsHs);

        TreeSet<String> emailsHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);










    }





}

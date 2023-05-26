package javaders.day22stringbuilder;

public class Sbf01 {
    /*
    1) StringBuffer Java.da String üreten bir Class.tir.
    2)StringBuffer, StringBuilder.a cok benzer, yanio ikisi de mutable String üretir.
    3)StringBuffer *multi-thread'dir. ama StringBulder multi-thread degildir. Thread--Is demektir.
    StringBuffer coklu ise uygundur. Eger kullandiginiz data coklu is yapacaksa StringBuffer kullanilir.
    Whatsapp.te ayni anda göruntu, ses isleniyor, arama bilgisi geliyor vs.
    4)Java StringBuffer'i StringBuilder.dan önce olusturdu.Ancak cok isi bi rada yapan sistem daha yavastir.
    5)StringBuilder multi-thread olmadigi icin StringBuffer.a göre daha hizli calisir.
    6) Multi Thread yapilirken yapilan islerin siralamasi önem arz eder. Yapilan isleri mantikli bir siraya koymak Sycronisation olarak adlandirilir.
    String Buffer multi- Thread oldugu icin ayni zamanda "sychronized" dir.

   3 tane String olusturan class ögrendik_;
   1)Eger immutable String lazimsa String Class
   2)Mutable String lazimsa String Builder veya StringBuffer
                             i) String Builder.i multi-thread gerekmezse kullaniliriz
                             ii)String Buffer.i multi-thread gerekirse kullaniliriz

                             */
    public static void main(String[] args) {
        StringBuffer sbf1=new StringBuffer();






    }
}

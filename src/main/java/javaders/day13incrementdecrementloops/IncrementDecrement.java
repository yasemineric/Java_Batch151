package javaders.day13incrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        a=a+2;
        System.out.println(a);
        a+=2;
        //Ex: bir int. variable.li iki sekilde 5 arttirin.

        int b=3;
        b=b+5;// kod yaziliminda tekrar
        // hos karsilanmayacagi icin  b+=5 yaparak da arttirim saglanir
        System.out.println(b);
        b+=5;// + ile = arasina bosluk koyulmaz hata verir
        System.out.println(b);

        // decrement
        int c=8;
        c=c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);
        //increment 2;
        int d=6;
        d=d*2;//12
        System.out.println(d);
        d*=2;//24
        System.out.println(d);
        //decrement2
        int e=24;
        e=e/2;
        System.out.println("e = " + e);
        e/=2;
        System.out.println("e = " + e);
        //"1" ile increment
        int f=12;
        f=f+1;
        f+=1;
        f++;// en kullanisli olani budur
        System.out.println("f = " + f);
        //"1" ile decrement
        int h=10;
        h=h-1;
        h-=1;
        h--;// en kullanisli olani budur
        System.out.println("h = " + h);

        //post-increment ve pre-increment
        int i=10;
        int k=i++;//(burada i. ye önce 10 degerini veriyor,
        // onu k.ya atiyor, arttirma isini kendi icinde sonra yapiyor.
        // ama k.nin degeri arttirilmamis i olarak kaliyor) post Increment-Variableden sonra increment ekleniyor
        System.out.println("k = " + k);//10
        System.out.println("i = " + i);//11-i satir sonunda arttirildigi icin i.nin degeri 11 olur
        int m=15;
        int n=++m;// pre increment-variableden önce increment ekleniyor
        System.out.println("n = " + n);//16
        System.out.println("m = " + m);//16

        int p=17;
        int r=p--;
        System.out.println("p = " + p);//16
        System.out.println("r = " + r);//17

        int s=20;
        int t=--s;
        System.out.println("s = " + s);//19
        System.out.println("t = " + t);//19
        /*
1) Increment artirmak demektir Decrement azaltmak demektir
2) Increment toplama ve carpma ile Decrement cikarma yada bolme ile yapilabilir
3) Increment ve Decrement 3 yolla yapilabilir
    a) int i = 12; ==> i = i + 5;
    b) int i = 12; ==> i+=5;
    c) int i = 12; ==> i++
    Note: 3. yol sadece 1 artirmak icin kullanilabilir

    a) int i = 12; ==> i = i - 5;
    b) int i = 12; ==> i-=5;
    c) int i = 12; ==> i--
    Note: 3. yol sadece 1 azaltmak icin kullanilabilir


 */


    }//main
}//class

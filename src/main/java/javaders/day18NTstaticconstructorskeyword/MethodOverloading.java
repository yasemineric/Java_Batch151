package javaders.day18NTstaticconstructorskeyword;

public class MethodOverloading {// asiri yükleme demek==> overloading
    /*
    1)Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2)Method Overloading Javada iyi organizasyon icindir.
    3)Method Overloading yaparken parametre 3 sekilde degistirilebilir.
       i)  Parametrelerin sayilari degistirilebilir
       ii) Parametrelerin data type larini degistirebiliriz.
       iii)Parametrelerin data type larini farkli ise yerleri degistirilebilir.
     4)"Method Overloading" bir class in icinde olusur.Bu yüzden "private methodlar' da overload edilebilir.
     prıvatelar classın dısına görünmez oldugu ıcın aynı class ta overloadıng kullandıgımız ıcın sıkıntı olmaz
     Method overloading bütün access modifierlarda kullanilabilir.

     */
    public static void main(String[] args) {
        System.out.println(add(3, 5));//method cagirma



    }//main

    public static int add(int a,int b){
        return a+b; }// ama bunu kullanir java yukaridaki method cagirma ile daha az is yapacagi icin

    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static double add(double a,int b){
        return a+b;
    }//bunlar da olur autowiedining le

    public static double add(int a,double b){
        return a+b;
    }//bunlar da olur autowiedining le yukaridaki double bir deger olursa buradaki int konteyner ina koyamayiz.Expilit narrowing olur.
    //ayni methodu farkli parametrelerle kullanmaya method overloading denir.

}

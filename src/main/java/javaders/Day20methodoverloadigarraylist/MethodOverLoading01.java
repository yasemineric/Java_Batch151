package javaders.Day20methodoverloadigarraylist;

public class MethodOverLoading01 {
    public static void main(String[] args) {
        String s="Java";
        //1)Method Overloading: Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        //2) Ne icin var: Daha derli toplu  bir yapi olsun diye, her parametreye göre yeni method olusturmamak adina var
        // Ornek substring methodu a)tek parametre b) iki parametre
        add(3,5);
        /*
        1)Method Overloading yapilirken method ismi degistirilmez
        2)Method Overloading yaparken parametreler degistirilir
          a) Parametre degistirirken , parametrelerin data type.lari degistirilebilir
          b)Parametre degistirirken , parametrelerin data type.lari farkli ise yerleri degistirilebilir
          c) Parametre degistirirken, parametrenin sayisi degistirilebilir
        3) Java icin ismi ve parametreleri ayni olan methodlar tamamen aynidir
           Bu yüzden ismi ve parametre==> "method signature" olarak adlandirilir.
        4) Method Overloading olusturuken return Type.i degistirmenin hic bir etkisi yoktur
           Method Overloading olusturuken Access Modifier degistirmenin hic bir etkisi yoktur
           Method Overloading olusturuken methodu static yada non-static yapmanin hic bir etkisi yoktur
           Method Overloading olusturuken Method Bady.i degistirmenin hic bir etkisi yoktur
        5) Private methodlar overload edilebilir. Cünku MethodOverloading sadece bir class.in icinde olur.
          "private" olmak baska class.lara gidildiginde sorun olur
        6) "static" methodlar overload edilebilirler
         */


    }
    public static void add(int a, int b){// () icerisi method signature.dir
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }


}

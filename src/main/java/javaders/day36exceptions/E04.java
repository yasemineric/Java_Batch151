package javaders.day36exceptions;

public class E04 {
    /*
       *throw keyword bir method body.si icinde istediginiz yerde, istedigimiz kosullar icin,
       istedigimiz kadar exception atamamizi saglar.
       * throw keywor.ü yazildiktan sonra Exception Class object.i olusturulur(new diyerek)
       * Exception Class Constructor.inin parantez icine istedigimiz Exception mesaji girebiliriz
       *
       * throw ile throws keyword.lerinin arasindaki fark nedir.
       * 1) throw method body.si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
       * 2) throw method body.si icinde istenilen yerde istenildigi kadar kullanilabilir.
       *    "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir
       * 3) throw.dan sonra new keyword ve Constructor kullanilarak object olusturulur
       *    throws.dan sonra sadece Exception Class ismi yazilir.
       * 4) throw belli sartlar icin Exception atmada kullanilir.
       *    throws ise Application.i Exception attiktan sonra durdurur.

     */
    public static void main(String[] args) {
        printAge(-63);


    }
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can not be negative"); // exception hata msj.inda bizim burada yazdigimiz teknik msj. vardir.
        } else if (age>150) {
            throw new IllegalArgumentException("Age can not be bigger than 150");
        } else{
            System.out.println(age);
        }

    }

}

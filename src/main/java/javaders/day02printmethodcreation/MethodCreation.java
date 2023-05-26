package javaders.day02printmethodcreation;

public class MethodCreation {
    public static void main(String[] args) {
        //static==> protokol tribunu VIP class(her önune gelen giremez)

        // Karenin alanini veren kodu yaziniz
        kareninAlani(7);

        // Dikdörtgenin alanini veren kodu yaziniz
        System.out.println("dikdortgeninAlani(10,20) = " + (dikdortgeninAlani(10, 20)+2));

       //Cemberin cevresini yazdiriniz
        cemberinCevresi(7,3.14);
        System.out.println("cemberinCevresi(7,3.14) = " + cemberinCevresi(7, 3.14));

        //Cemberin Alanini yazdirniz
        cemberinAlani(7,3.14);
        System.out.println("cemberinAlani(7,3.14) = " + cemberinAlani(7, 3.14));


    }//main

    private static double cemberinAlani(int r, double pi) {
        return pi*r*r;
    }

    private static double cemberinCevresi(double r, double pi) {
        return 2*pi*r;
    }

    private static int dikdortgeninAlani(int a, int b) {

        return a*b;
    }

    private static void kareninAlani(int a) {
        System.out.println("Karenin Alani : "+(a*a));
    }
}//class

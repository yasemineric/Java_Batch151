package javaders.day03methodcreationscanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // dikdörtgenin alanini hesaplatan bir method olusturunuz

        dikdortgen(10,20);


// Karenin alanini hesaplatan methodu yaziniz

        kareAlani(6);
        System.out.println("kareAlani(6) = " + (kareAlani(6)+2));

    }//main

    private static int kareAlani(int a) {
        return a*a;


    }

    private static void dikdortgen(int a, int b) {
        System.out.println(a*b);

    }
}//class

package introduction.day02datatypesmethodcreation;

public class MethodCreation03Deneme {
    public static double donendeger() {
        int sonuc=0;
        for(int i=0; i<100; i++)
            sonuc=sonuc +i;
        return sonuc;

    }

    public static void main(String[] args) {
        System.out.println(donendeger());

    }


}

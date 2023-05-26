package introduction.day02datatypesmethodcreation;

public class MethodCreation02Deneme {

    public static void main(String[] args) {
        int sonucKareAlma= kareAlma(78);
        System.out.println(sonucKareAlma);

        long ergebnisDerPopulation =populationDerWelt(6000000000L);
        System.out.println(ergebnisDerPopulation);

    }

    public static int kareAlma(int a){
        return a*a;

    }
    private static long populationDerWelt(long a){
        return a*10+a;

    }

}

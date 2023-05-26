package b151practices.deneme;

public class Q04_Hipotenus {
    //Hipotenusü hesaplayan kod yaziniz

    public static void main(String[] args) {

        System.out.println(getHipotenus(3,4));


    }

    public static double getHipotenus(double x, double y) {
        double hipotenus =Math. sqrt(x*x+y*y);
        return hipotenus;


    }
}

package introduction.day02datatypesmethodcreation;

import java.util.Scanner;

public class Day02DaireCevreAlanHesabi {
    public static void main(String[] args) {
        int yariCap;
        double daireAlani, daireHacmi;

        Scanner input =new Scanner(System.in);
        System.out.println("Daire`nin yaricapini giriniz: " );
        yariCap= input.nextInt();
        daireAlani=2*3.14*yariCap;
        daireHacmi=3.14*yariCap*yariCap;

        System.out.println("Dairenin alani= " + daireAlani);
        System.out.println("Dairenin hacmi= " +daireHacmi );





    }
}

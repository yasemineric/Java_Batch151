package b151practices.smallStudyGroup.dataType01;

public class C01_dataType {
    public static void main(String[] args) {
        byte num1=127;
        int num2=128;
        double num3=13.999;
        System.out.println(num3);// 13.0
        long num4= 899999L;
        System.out.println(num4);
        float num5= 18.99F;
        System.out.println(num5);
        short num6=32;
        System.out.println(num6);
        boolean verliebtOder= false;

        char punkt = '.';

        char chr1 =Character.MIN_VALUE;
        System.out.println(chr1);

        System.out.println(verliebtOder);
        System.out.println(punkt);
        System.out.println(num1+num2+num3+num4+num5+num6);//900318.9889997711 bize double bir veri döndu' cunku tum toplanan veriler arasinda en kapsamlisi o.


    }
}

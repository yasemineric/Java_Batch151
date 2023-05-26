package LAMBDA.day03;

public class Utils {// gerekli alet, edevat: gerekli methodlarin bulundugu class
    public static int karesiniAl(String s){//getSquare
        return s.length()*s.length();
    }

    public static boolean ciftMi(String s){
       return s.length()%2==0;
        }//isOdd


    public static int getSumOfDigits(int a){
        int sum=0;
        while(a>0){

            sum = sum + a%10;

            a = a/10;
        }

        return sum;

    }

    }


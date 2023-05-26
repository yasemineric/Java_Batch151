package javaders.day42lambda;

import LAMBDA.day03.Utils;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        //IntStream: bize integer.i stream halinde önümüze döker.
        //rangeClosed(): baslagic ve bitis dahil
        //range(): baslangic dahil, bitis dahil degil
        System.out.println(getSumInTheGivenRange(7,10));//34
        System.out.println(getMultiplicationInTheGivenRange(7,10));//5040
        System.out.println(getSumOfDigitsInTheGivenRange(45,47));//30

    }
    private static void swap(int starting, int ending){
        if(starting>ending){ // Bu durumda swap yaparak durumu tersine cevirebiliriz.
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }

    }


    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz
    public static int getSumInTheGivenRange(int starting, int ending){
        swap(starting,ending);// method icinde method: recursive Method
       return IntStream.rangeClosed(starting, ending).sum();// rangeClosed(starting, ending) methodu ilk sayi büyük oldugunda calismiyor. 0 verir
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();

        //reduced() methodu arastir???dönüsrürmek
    }

    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //45 46 47==? 4+5+4+6+4+7
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigits).sum();

    }




}

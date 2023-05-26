package b151practices.deneme;

import java.util.Scanner;

public class M06_Deneme {
    public static void main(String[] args) {
        //Soru 6:Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    //Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf,
    // kucuk harf yada hatali giris seklinde code create ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Buchstabe ein");
        char chr = input.next().charAt(0);
        String result=(chr>='a'&&chr<='z'||chr>='A'&&chr<='Z')?(chr>='a'&&chr<='z'?"kleine Buchstaben":"große Buchstaben"):"falsche Buchstaben";
        System.out.println(result);



    }
}

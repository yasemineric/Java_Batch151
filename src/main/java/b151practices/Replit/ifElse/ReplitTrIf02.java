package b151practices.Replit.ifElse;

import java.util.Scanner;

public class ReplitTrIf02 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
Input :
John White
1234234534561478
Output :
Name :
J*** W****
CCN  : **** **** **** 1478
* Ilk Harfler Buyuk harf ile baslamalidir.

for(int i=0;i<s.length();i++){
          String ch=s.substring(i,i+1);// substring baslangic indexi dahil, bitis indexi haric
        if(i%2==0){
            System.out.print(ch.toUpperCase()+ " ");
        }

         */

        String name="John White";

        String CCN="1234234534561478";

        String vorName=name.split(" ")[0].replaceAll("[^A-Z]","*");
        String nachName=name.split(" ")[1].replaceAll("[^A-Z]","*");
        System.out.println(vorName+" "+nachName);

        if (CCN.length()!=16) {
            System.out.println("Invalid Kredit Card Number");
        }
        String dortlu="";
        System.out.print("CCN  : ");
        for (int i = 0; i < CCN.length()-4; i+=4){
            dortlu=CCN.substring(i,i+4).replaceAll("[0-9]","*" );
            System.out.print(dortlu+" ");
        }
        String lastFour = CCN.substring(CCN.length() - 4);
        System.out.print(lastFour);




        /*
        for (int i = 0; i < CCN.length(); i++) {


            if (i%4 ==0 ) {
                System.out.print(" ");
            } else if (i < CCN.length() - 4) {
                System.out.print("*");
            } else {
                String lastFour = CCN.substring(CCN.length() - 4);
                System.out.print(lastFour);
                break;
            }



        }

         */

        Scanner input = new Scanner(System.in);
        String isim=input.nextLine();
        String kart= input.next();
        String str[]= isim.toUpperCase().trim().split(" ");
        String sifre="";
        for (String w:str    ) {
            sifre= sifre+w.charAt(0);
            for (int i = 0; i <w.length()-1 ; i++) {
                sifre=sifre+"*";
            }
            sifre=sifre+" ";
        }
        sifre=sifre.trim();
        System.out.println(sifre);
        String son= kart.substring(kart.length()-4);
        System.out.print("CCN  : ");

        System.out.print("**** **** **** ");

        System.out.print(son);









    }

}

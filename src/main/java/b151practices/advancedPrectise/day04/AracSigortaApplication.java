package b151practices.advancedPrectise.day04;

import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {

        start();

    }//main

    private static void start() {
        Scanner input=new Scanner(System.in);
        boolean isFail;

        do {
         isFail= false;// verilen data dogru mu
            System.out.println("Lütfen tarife dönemini giriniz"+
                    "\n1==> Haziran 2023\n2==> Aralik 2023");

            int term=input.nextInt();
            if (term==1 || term==2){

                Arac arac=new Arac();
                System.out.println("Lütfen arac tipini giriniz");
                arac.type=input.next().toLowerCase();
                arac.prim=arac.countPrim(term);
                int select;// Tamam mi variable.i
                String termName=term==1?"Haziran 2023":"Aralik 2023";
                if(arac.prim>0){
                    System.out.println("Hesaplama basariyla tamamlandi");
                    System.out.println("Arac Tip : "+arac.type);
                    System.out.println("Tarife Dönemi : "+termName);
                    System.out.println("Aracinizin Sigorta Primi Ödemesi : "+arac.prim);
                    System.out.println("Yeni islem icin ==> 1\nCikmak icin ==> 0 basiniz");
                    select=input.nextInt();//Tamam mi, devam mi
                    if(select==1){
                        isFail=true;
                    }else{
                        isFail=false;
                    }

                }else{
                    System.out.println("Hesaplama basarisiz ");
                    System.out.println("Yeni islem icin ==> 1\n Cikis icin ==> 0 giriniz");
                    select= input.nextInt();
                    if (select==1){
                        isFail=true;
                    }else {
                        isFail=false;// uygulamadan cikisi saglar
                    }
                }

            }else{
                System.out.println("Hatali giris");
                isFail=true;
            }
        }while (isFail);
        System.out.println("Yine bekleriz");



    }//start
}//class

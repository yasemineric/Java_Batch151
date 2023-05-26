package b151practices.advancedPrectise.day04;

import java.util.Scanner;

public class Arac {
    /*
     1.dönemi :Haziran   2023                       2.dönem:Aralık 2023
                 otomobil: 2000 TL                    otomobil: 2500  TL
                 kamyon:   3000 TL                    kamyon  : 3500  TL
                 otobüs: tip1: 4000TL                 otobüs: tip1: 4500 TL
                         tip2: 5000TL                         tip2: 5500 TL
                 motosiklet: 1500  TL                 motosiklet: 1750 TL
     */

    public String type;
    public int prim;

    public int countPrim(int term) {//Prim hesapla methodu
        if (term == 1) {
            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2000;
                    break;
                case "kamyon":
                    prim = 3000;
                    break;
                case "otobüs":
                    prim = countBusPrim(term);
                    break;
                case "motosiklet":
                    prim = 1500;
                    break;
                default:
                    System.out.println("Hatali giris");
                    prim = 0;
                    break;
            }

        } else if (term == 2) {
            switch (type.toLowerCase()) {
                case "otomobil":
                    prim = 2500;
                    break;
                case "kamyon":
                    prim = 3500;
                    break;
                case "otobüs":
                    prim = countBusPrim(term);
                    break;
                case "motosiklet":
                    prim = 1750;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
                    prim = 0;
                    break;
            }
        } else {
            System.out.println("Haatli giris yaptiniz");
        }
        return prim;
    }// countPrim()

    public int countBusPrim(int term) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen otobüs tipini giriniz" +
                "\n1==>(18-30)\n2==>31 ve üzeri koltuklu");
        String busTypeStr = "";

        while (!busTypeStr.equals("1") && !busTypeStr.equals("2")) {// hata alma riski olan variable.in
            try {  // üzerine gelip ctrl+alt+t yapip try-catch secmeliyiz
                busTypeStr = input.nextLine();
                if (!busTypeStr.equals("1") && !busTypeStr.equals("2")) {
                    System.out.println("Hatali giris yaptiniz.\nLütfen gecerli bir otobus tipi seciniz");
                }
            } catch (Exception e) {
                System.out.println("Hatali veri girdiniz.Lütfen dogru otobus tipi seciniz");
            }

        }//while

        int busType = Integer.parseInt(busTypeStr);// String methodu int olarak degistirebiliyoruz
        prim = (busType == 1) ? ((term == 1) ? 4000 : 4500):
                                ((term == 1) ? 5000 : 5500);

        return prim;

    } //countBusPrim()

}


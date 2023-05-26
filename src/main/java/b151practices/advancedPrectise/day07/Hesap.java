package b151practices.advancedPrectise.day07;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {
    private ArrayList<Order> orders = new ArrayList<>();//1001-1002-1003-1004 Unique kodlar olusturuluyor.

    public void addOrder(Order order) {
        orders.add(order); // yukaridaki arraylist.e ekleme yapar

    }

    public double getTotalAmount() {// toplam siparis tutari
        return orders.
                stream().
                mapToDouble(Order::getTotalAmount).
                sum();// toplama yapacagimiz zaman da data degisir, o yüzden map kullandik, double veriler icin de mapToDouble.
    }

    public void printHesap() {
        System.out.println("*********************** HESAP FISI *************************");
        for (Order order : orders) {//1001-1002-1003-1004 // Orders Listesindeki her bir veriyi al, Order Classinda order conteyner.inin icine yerlestir.
            System.out.println("Siparis Kodu : " + order.getOrderCode());
            System.out.print("Yiyecekler : ");
            HashMap<MenuItem, Integer> items = order.getItems();//Vermis oldugu siparisler, order variable.ni kullanarak getItems ile aliyoruz

            for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {// entrySet() methodu map.deki veriyi ayirip alammiz icin gerekli.
                // getKey() ve getValue() methodlari entrySet ile calisir. entrySet() de map.lerle degil, Entry arayüzü ile calisir.
                MenuItem item = entry.getKey();
                Integer adet = entry.getValue();
                System.out.printf("%-20s %d x %.2f TL" + //string s, tam sayi d, ondalikli f
                        item.getName(), adet, item.getPrice());// formatli yazdirir %.2f==>  virgulden sonra kac basamak
                // görmek istiyorsak . dan sonra 2 giriyoruz ve f koyarak ondalikli görmek itedigimizi belirtiyoruz.

                //% formatli olarak yazdirir -  sola yasla 20 karakter ayir s==>String data
                // d==> tamsayi  %.2==> virgulden sonra 2 basamak yazdir  f ==> ondalikli sayilar icin

            }
            System.out.println(order.getTotalAmount());

        }// for each tüm yiyecekler
        System.out.println(getTotalAmount());


    }
}

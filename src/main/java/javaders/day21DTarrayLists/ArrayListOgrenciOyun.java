package javaders.day21DTarrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOgrenciOyun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Please enter a letter...");

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("S");
        list.add("D");
        list.add("F");
        list.add("G");

        int counter = 0;
        int kazanc = 0;


        do {

            System.out.println(5-counter+" Tahmin hakkiniz kaldi.");
            counter++;
            if (counter==6){
                System.out.println(list);
                if (kazanc>2){
                    System.out.println("Kazandiniz");
                    break;
                }else {
                    System.out.println("Kaybettiniz");
                    break;
                }

            }

            String let = input.next().toUpperCase().substring(0,1);
            if (list.contains(let)){
                list.set(list.indexOf(let),"Buldum" );
                System.out.println(list);
                kazanc++;
            }else {
                list.add(let);
                System.out.println(list);
                kazanc--;
            }
        }while (true);



    }
}

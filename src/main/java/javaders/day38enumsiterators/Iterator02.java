package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        //verilen her listede ki her elemani 3 arttiran methodu yaziniz

        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]
        ListIterator itr= list.listIterator();// [(itr)5, 9, 2, 1, 17, 3]// itr objesi olusturduk
        while (itr.hasNext()){
            Object sayi=itr.next();// int data tipini direkt kabul etmez, Object kullandik
            itr.set((Integer)sayi+3);// Wrapper yaptik
        }
        System.out.println(list);//[8, 12, 5, 4, 20, 6]




    }

}

package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {
        //Verilen bir listeyi tersten yazdiran kodu olusturunuz

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);//[1, 2, 3, 4, 5]
        ListIterator itr= list.listIterator();
        while (itr.hasNext()){
            itr.next();// bunun ile pointer son elemana gitti, hasPrevious ile de terten elemanlari aliyoruz
            //System.out.print(itr.next()+" ");
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }



    }
}

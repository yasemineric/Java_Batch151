package b151practices.MentorTeam.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators02Q {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        ListIterator<String> it = list.listIterator();
        if(it.previousIndex()==-1) {
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");
        }




        List<String> list2 = new ArrayList<>();
        list2.add("AB");
        list2.add("CD");
        list2.add("EF");
        ListIterator<String> it2 = list2.listIterator();
        if(it2.previousIndex()!=-1) {
            while(it2.hasNext()) {
                System.out.print(it2.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");
        }
    }


    }






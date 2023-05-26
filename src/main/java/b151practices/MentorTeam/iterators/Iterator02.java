package b151practices.MentorTeam.iterators;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        for(String w : list) {
            w = w + "!";
            System.out.println(w);
        }
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("AB");
        list2.add("CD");
        list2.add("EF");
        ListIterator<String> it = list2.listIterator();
        Collections.reverse(list2);
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }



    }
    }



package b151practices.deneme;

import java.util.ArrayList;

public class JavaK_ArrayList_04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.remove(2));
        System.out.println(list.remove(1));
        System.out.println(list.remove("C"));
        System.out.println(list.remove("F"));
    }




}

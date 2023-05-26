package b151practices.deneme;

import java.util.ArrayList;
import java.util.List;

public class JavaK_ArrayList_06 {
    List<String> list1 = new ArrayList<String>();

   /* List<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    */



    public static void main(String[] args) {
        Test01 obj1 = new Test01();
        obj1.myMethod(obj1.list1);
        obj1.list1.add("z");
        obj1.list1.add("t");
        System.out.println(obj1.list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(3);
        list2.add(1);
        list2.remove(4);
        System.out.println(list2);

    }
    public List<String> myMethod(List<String> list1) {
        list1.add("x");
        list1.add("y");
        return list1;
    }
}

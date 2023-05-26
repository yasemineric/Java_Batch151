package b151practices.deneme;

import java.util.ArrayList;
import java.util.List;

public class Test01 {  // Array List 06.soru
    List<String> list1 = new ArrayList<String>();
    int c=12;
    public static void main(String[] args) {
        Test01 obj1 = new Test01();
        obj1.myMethod(obj1.list1);
        obj1.list1.add("z");
        obj1.list1.add("t");
        System.out.println(obj1.list1);
       // System.out.println(c);
    }
    public List<String> myMethod(List<String> list1) {
        list1.add("x");
        list1.add("y");
        return list1;

    }

     public void toplam(int a, int b){
        list1.add("a");
         System.out.println(list1);
         System.out.println(c);
         myMethod(list1);
     }



/* ArrayList<Character> list = new ArrayList<Character>();// Array List 07.soru
        for (char i = 'a'; i <= 'e' ; i++) {
            list.clear();
            list.add(i);
        }
        System.out.println(list);
 int arr[] = { 1, 3, 5, 7, 9 };
        for (int w : arr) {
            System.out.print(w + " ");
            if(w>4) {
                break;
            }
        }

        */






}

package javaders.day34colllectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {


        Queue<String> wareHause=new LinkedList<>();
        wareHause.add("Milk");
        wareHause.add("Meat");
        wareHause.add("Egg");
        wareHause.add("Bread");
        wareHause.add("Cheese");
        System.out.println(wareHause);//[Milk, Meat, Egg, Bread, Cheese]

        wareHause.remove();// Ilk elemani siler
        System.out.println(wareHause);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHause.peek());//Meat--ilk elemani silmeden verir, copy paste yapar.
        System.out.println(wareHause);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHause.element());//Meat--Peek ile ayni seyi yapar,tek farkla;
        // eger set yada queue icinde eleman varsa element ve peek ayni isi yapar, ama eleman yoksa
        // element method.u hata verir, peek ise null verir.
        System.out.println(wareHause);//[Meat, Egg, Bread, Cheese]

        wareHause.clear();
        // System.out.println(wareHouse.element());Exception
        System.out.println(wareHause.peek());//null




    }
}

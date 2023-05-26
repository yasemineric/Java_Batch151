package javaders.day35exceptions;

public class E04 {
    public static void main(String[] args) {

        String arr[]={"A","G","M","L"};
        getElementFromArray(arr, 1);//G
        getElementFromArray(arr, 5);//ArrayIndexOutOfBoundsException--Index 5 out of bounds for length 4

    }
    public static void getElementFromArray(String [] s, int idx){
        //Array.lerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar.
        try{
            String el=s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());//null
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
          e.printStackTrace();/*
          java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
	      at javaders.day35exceptions.E04.getElementFromArray(E04.java:13)
	      at javaders.day35exceptions.E04.main(E04.java:8)
	       */
        }
        System.out.println("try-catch method görev tamamlandi");



    }
}

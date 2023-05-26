package javaders.day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Ex: Verilen bir stringde ilk 'a' harfinden onceki tüm karakterleri konsola yazdiriniz

        String s="I love Java";
        for(int i=0;i< s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.println(ch);
        }
        System.out.println();

        //Ex2: Verilen bir Stringde son 'a' dan sonraki tüm karakterleri ters sira ile yazdirin
        String str="Germany";//yn
        for(int i=str.length()-1;i>=0;i--){// i>=0 yada i>-1 de yazilabilir

            char ch1= str.charAt(i);
            if(ch1=='a'){
                break;
            }
            System.out.println(ch1);

        }

        /*
        String t = "Germany";
        int x = t.length()-1;
        for (int i=x ; i>t.indexOf('a') ;i--){
            System.out.print(t.charAt(i));
        }
         */
    }//main

}//class

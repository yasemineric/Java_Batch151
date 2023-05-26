package b151practices.Replit.array;

import java.util.ArrayList;

public class ReplitTrArray07 {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
         */


        String[] str={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> newstr =new ArrayList<>();

        for(String w: str){

            newstr.add(w);

        }System.out.print(newstr);







    }
}

package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
        1) Array Javanin ayni data tipinde coklu data depolamak icin olusturdugu bir yapidir
        2) Array.ler primitiv data type.leri veya reference ile calisir
        ) Arraylar super fast.dir ve memory.de cok az yer kaplar


         */
    public static void main(String[] args) {
        // Array nasil olusturulur
        String stdNames[] = new String[5];// burada 5 yazmazsak hata verir, java.ya nekadarlik depolama yapacagimizi bildiriyoruz
        // Array nasil yazdirilir*4
        System.out.println(Arrays.toString(stdNames));// [ null null null null null]-- null.lar String.in default degeridir.
        // Array.e nasil eleman eklenir
        stdNames[0] = "Ajda";
        stdNames[3] = "Cüneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));

        //Array.deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);// cüneyt

        // example 1: stdNames array.indeki her ismin sonuna * koyarak yazdirin
        //1.Way
        for (int i = 0; i < stdNames.length; i++) { // length Stringlerde parantezli(method), Arraylarde parantezsiz(method degil) kullanilir
            System.out.println(stdNames[i] + "*");
        }
        //2.Way: For-each Loop--Enhanced(zenginlestirilmis) loop- Mümmkunse hep for-each loop kullanilir, degilse digerleri
        for(String w: stdNames){
            System.out.println(w+"*");
        }
        //Ex.2: bir Integer Array olusturunuz. 5 eleman ekleyiniz. elemanlarin toplamini bulup konsola yazdirin
       int numbers[] = new int[5];
        numbers[0]=12;
        numbers[1]=23;
        numbers[2]=9;
        numbers[3]=38;
        numbers[4]=27;
        System.out.println(Arrays.toString(numbers));
        int sum=0;
        for( int w:numbers){
            sum=sum+w;
        }
        System.out.println(sum);

        //Ex3: Bir char arrayi olusturun 3 eleman ekleyin elemanlarin carpimini bulup yazdirin

        char ch[]=new char[3];
        ch[0]='A';
        ch[1]='b';
        ch[2]='c';
        int carpim=1;
        for(char w:ch){
            carpim=carpim*w;// java matematiksel islemile chari görunce ascii degerini alir
        }
        System.out.println(carpim);


    }//main
//class
}

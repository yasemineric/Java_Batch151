package javaders.day15loopsarrays;

import java.util.Arrays;

public interface Array02 {
    /*
    1)Application.larda "data" ile bu datalari isleyen kodlar(logic) birbirinden ayrilir
    Yani; logic data'ya bagimli olmamalidir.
   Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
  "hard code" hatali kod demektir.

  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz
     */
    public static void main(String[] args) {
        // Arrayleri kisa yoldan nasil olusturabiliriz?
        //int grades[]=new int[];(bu yöntemde tek tek eleman yazdirmak lazim)

        //(data)
        int grades[]={67,98,100,34,76};
        System.out.println(Arrays.toString(grades));


        //(kodlar)
        //Ex.1.grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz
        Arrays.sort(grades);// sort kücükte büyüge siralar
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);// kücükten büyüge siranlanmis verilerden 0. index ile sonuncu indexi böyle buldururuz

        //Ex:2.Size verilen bir String array.deki isimlerden 5 character.den az  character icerenleri console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        for(String w:stdNames){
            if(w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println();
        //Ex:3.Size verilen bir String array.deki isimleri alfabetik siraya koyduktan sonra F ile baslayan isimlerden onceki isimleri konsola yazdirin
        Arrays.sort(stdNames);// isimleri de alfabetik siraya koyar

        for(String w:stdNames){
            if(w.startsWith("F")){
            break;
            }
            System.out.println(w);
        }

        System.out.println();
        //Ex:4.Size verilen bir String array.deki isimleri alfabetik siraya koyduktan sonra F ile baslayan isimlerden onceki isimleri ve F ile baslayanlari konsola yazdirin
        Arrays.sort(stdNames);

        for(String w:stdNames){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }
        }

        System.out.println();
        //Ex:5.Size verilen bir String array.deki isimleri alfabetik siraya koyduktan sonra F ile baslayan isimler haric diger isimleri yazdirin
        Arrays.sort(stdNames);// sort() methodu numeric datalari kücükten büyüge(ascending) dizer
                              // Stringleri ise alfabetik sirada(alphabetically) dizer
                              // ascending+alphabetically---Natural Order
        for(String w:stdNames){
            if(w.startsWith("F")){
                continue; // bosver gitsin
            }else{
                System.out.println(w);
            }
        }


    }//main
}//class

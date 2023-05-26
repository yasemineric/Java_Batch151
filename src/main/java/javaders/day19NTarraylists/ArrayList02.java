package javaders.day19NTarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    /* Bir Method ögrenirken dikkat edilmesi gerekenler;
    //O method ne iş yapar?
    //O method nasıl kullanılır?
    //O method size neyi verir?
     */
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");

        System.out.println(cities);

        //ArrayList.te bir elemanin ilk görünümünü nasil sileriz
        //remove methodu iki adet dataType ile overloading edilmistir.
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);
        //cities bir Object dir.Object ile kullanilan methodlar non-static dir// Burada string olarak bir elemani secip sildiriyoruz

        //ArrayList.te bir eleman index.i kullanarak nasil silinir?
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Giresun, Miami]
        cities.remove(2);//Barcelona- istedigimiz index deki elemani siliyoruz
        System.out.println(cities);//[Giresun, Yozgat, Giresun, Miami]

        //ArrayList olustururken en basa Arraylist yerine List de yazabiliriz. Sebebine collections da görecegiz
        //ArrayList<Integer> ages=new ArrayList<>();
        List<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        //Ex1. 12 elemanini ages List.den siliniz
       //ages.remove(index:12); Primitiv 12 girince index zanneder
        ages.remove((Integer)12); //Eger int. elemani silmek istiyorsak Wrapper Integer.a cevirmeliyiz
        System.out.println(ages);

        //ArrayList.de bir elemanin butun görunumlerini nasil sileriz
        List<String > citiesToRemove= new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        cities.removeAll(citiesToRemove);//removeAll-Tüm görunumleri siler.
        // Silmek istenilenler bir List.in icine atanir, ondan sonra removeAll.a atariz
        System.out.println(cities);//[Miami]


        List<Character> initials=List.of('a','k','c','d','k');// Array List.i kisa yoldan olusturmak icin List.of() kullanilir.
        //Uzun yol da new ArrayList olusturmak icine tek tek add. yapmak lazim
        System.out.println(initials);//[a, b, e, c,k]
        //initials.add('e');List.of methoduna ekleme ve cikarma yapilmaz
        //initials.set(0,'u');//bunlar calismaz

        /*
        int index = 0;
        List.Of.u Array list.in icine atarsak ekleme cikarma vs. yapabiliriz
        List<String> colour = new ArrayList<>(List.of("siyah", "mavi", "kirmizi", "beyaz"));
        colour.add(0,"pembe");
        colour.add(1,"kahverengi");
        colour.add(colour.indexOf("mavi")+1,("yesil"));
        System.out.println(colour);
         */

        List<Character> letters=List.of('a','c','k','d','k');
        System.out.println(letters);

        //Iki Arraylist'in birbirine esit olup olmadiigni nasil anlariz?
        boolean r1=initials.equals(letters);//equals() methodu hem elemanlar ayni mi diye bakar,
        // hem de elemanlar ayni index.te mi diye bakar.%100 örtüsmesi lazim.
        System.out.println(r1);

        //indexOf('k') yazarsak k.nin ilk görunumunun indexini verir
        int r2=initials.indexOf('k');
        System.out.println(r2);//1
        //LastIndexOf('k') yazarsak k.nin son görunumunun indexini verir
        int r3=initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Ex1: bir listteki tekrarsiz elemanlari console.a yazdiran kod.u yaziniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for(Double w: prices){// Arraylerde oldugu gibi List.lerde de For each loop ilk önceligimiz olmali
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");//3.75 4.0

            }
        }
        System.out.println();

        //Ex2//Bir List.te tekrarli bir eleman olup olmadigini gösteren kodu yaziniz
        List<Integer> heights = List.of(3,13,3);
        int counter=0;
        for(Integer w: heights){// Arraylerde oldugu gibi List.lerde de For each loop ilk önceligimiz olmali
            if(heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("All elements are unique in the List");
        }else{
            System.out.println("At least one element is not unique in the list");
        }
    }
}

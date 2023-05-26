package javaders.day19NTarraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    /*
    1)Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
    2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
    3)Array'ler eleman sayisinda esenek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu.
      Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak, 100
      eleman koyarsaniz eleman sayisini 1000 olarak ayarlarç
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5)Java "ArrayList" leri olusturduktan sonra "Array"leri iptal etmedi cunku;
        i)Array'ler super hizlidir.
        ii)Array'ler memory'de cok az yer kaplar.
    6)Array'ler primitive data type'leri ve "reference"lari depolayabilir."ArrayList" ler non-primitive data type' lerini
      depolar; bu yuzden "ArrayList"ler Array'lerden daha cok yer kaplar.

 */
    public static void main(String[] args) {


        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);
        // Array List.e eleman ekleme
        ages.add(12);
        ages.add(24);
        ages.add(9);// add() methodu elemanlari giris sirasina(insertion order) göre List.e yerlestirir.
        System.out.println(ages);//[12,24,9]

        //2.Way
        ages.add(1,99);
        System.out.println(ages);//[12,99,24,9]

        ArrayList<Integer>price= new ArrayList<>();
        price.add(23);
        price.add(33);
        //.3.way:addAll() methodu bir List.i diger List.in icine ekler
        ages.addAll(price);
        System.out.println(ages);//[12,99,24,9,23,33]
        //4.Way: Bir List.i baska bir List.de istedigimiz yere yerlestirmek icin addAll(index,...)
        ages.addAll(3,price);
        System.out.println(ages);//[12,99,24,23,33,9,23,33]

        //ArrayList.de eleman sayisi nasil bulunur--size()
        int numOfElement = ages.size();// size() methodu bir List.deki eleman sayisini verir.
        System.out.println(numOfElement);

        //ArrayList.de specific bir eleman nasil alinir--get()
        int el1 =ages.get(3);// get methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(el1);

        //ArrayList.de specific bir eleman nasil degistirilir.--set()
        ages.set(6,111);//6.index deki elemani 111 ile degistir
        System.out.println(ages);//[12,99,24,23,33,9,111,33]

        //ArrayList.de bir elemanin olup olmadigini sorgulama--contains()
        boolean r1=ages.contains(99);
        System.out.println(r1);//true

        //Bir ArrayList.in bos olup olmadigini nasil kontrol ederiz
        boolean r2=ages.isEmpty();
        System.out.println(r2);//false

        // Bir ArrayList.deki tüm elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);//[]

       boolean r3= ages.isEmpty();
        System.out.println(r3);

        // ex.1) Bir List.in bos olup oladigini kontrol eden kod yaziniz
        ArrayList<String> names= new ArrayList<>();
        names.add("Ajda");
        names.add("Ajda");
        names.add("Ajda");
        names.add("Ajda");
        //1.way:
        if(names.size()==0){// burada 1 method 1.de karsilastirma vardir. iki is birden
            System.out.println("List bostur");
        }else{
            System.out.println("List.te en az bir eleman vardir");
        }
        //2way:Bu yol usttekine göre daha iyidir.
        //Java bir is icin method uretmisse önce onu almaliyiz
        if(names.isEmpty()){// burada tek method kullanilir
            System.out.println("List is empty");
        }else{
            System.out.println("Listhas at least 1 element");
        }

        char arr[] = new char[4];
        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';
        System.out.println(Arrays.toString(arr));//[A,  , E, M] Char.in null degeri hicliktir.

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        System.out.println(arr1==arr2);
        System.out.println(arr1==arr1);

        int a=5;
        int b=5;
        System.out.println(a==b);

        int arr3[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr3);
        System.out.println(Arrays.binarySearch(arr3, 12));
        

    }

}

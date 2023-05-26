package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges= new HashMap<>();//1.data tipi Key.ler icin, 2.data tipi value.lar icin.
        // put() methodu key ve value.lari birlikte ekler.
        //Map.lerde Key.ler tekrarsiiz olmali, ama value.ler ayni olabilir

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        //key.i tekrarli kullandigimizda hata vermez, en son verilen entry.nin degerini kabul eder.
        //Bu yöntem value güncellemede kullanilabilir. Buna "overwrite" denir.
        System.out.println(stdAges);//{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}// her biri entry olarak adlandirilir.
        stdAges.put("Tom", 83);

        //HashMap.ler entry.leri rastgele siralar, bu yüzden cok hizli calisir.
        //Map.ler entry.leri siralarken Key.lere bakarak siralar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace() methodu value.leri, key.leri kullanarak update yapmaya yarar.
        stdAges.replace("Ezel", 39);// Ezel.in yasini güncellemek icin replace kullanip, ezel.in 38 olan yasini 39 yapabiliriz
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}


        //replace("Angelina", 58,61); methodu Map icinde "Angelina", 57 varsa 57.i 61.e dönüstürür, yoksa dönüstürmez.
        stdAges.replace("Angelina", 58,61);// Eski degeri bu sekilde de güncelleyebiliriz
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        // stdAges.putIfAbsent("Ali", 60); methodu Map.de "Ali" key olarak yoksa Map.e "Ali=60".i ekler, varsa eklemez.
        stdAges.putIfAbsent("Ali", 60);
        System.out.println(stdAges);

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom",0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse",0));//0-- Olmayan entry icin default karakter ne girdiysek onu verir.

        //containsValue(77); methodu value'larin icerisinde 77 olup olmadigini kontrol eder.
        stdAges.containsValue(77);//true
        stdAges.containsValue(99);//false

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //remove("Ali"); method.u key kullanarak entry.i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom",81); method.u Map.de key.si "Tom", value.si 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom",81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        System.out.println(stdAges.size());//5-- kac tane entry. oldugunu bize verir.

        HashMap<String, Integer> kidsAge=new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        //putAll(kidsAge); method.u stdAges Map.ine kisAges Map.ini ekelr. Dolayisiyla stdAges Map.i degismis olur.
        //Ama kidsAge Map.i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}







    }


}

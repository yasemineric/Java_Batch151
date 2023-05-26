package b151practices.day_11_practice;

public class Den_C03_Cons {
    // Baska siniftaki instance variable.lara ulasmak icin obje olusturmamiz lazim

    public static void main(String[] args) {


    C03_Constructor obj1=new C03_Constructor();// esitligin sag tarafi constructor.dir.
    // () icinde hic bir deger oladigi icin parametresizdir.
    //Bu constructor.imiz diger C03_Constructor sinifindaki default constructor.a gidecek
    // orada herhangi bir deger olmadigi icin aynen geri dönecek

        obj1.marka="Mercedes";
        obj1.model="C180";
        obj1.yil=2023;
        obj1.yakit="Benzin";

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);





    }

}

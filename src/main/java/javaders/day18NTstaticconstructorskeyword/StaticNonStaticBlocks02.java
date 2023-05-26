package javaders.day18NTstaticconstructorskeyword;

public class StaticNonStaticBlocks02 {
    public StaticNonStaticBlocks02(){
       // System.out.println("I am constructor");// bu tekrarli bir kod, bunun yerine asagida 1 tane nonstaticblock yazabiliriz
        System.out.println("Constructor 1");

    }
    public StaticNonStaticBlocks02(int price){
        //System.out.println("I am constructor");
        System.out.println("Constructor 2");

    }
    public StaticNonStaticBlocks02(String name){
        //System.out.println("I am constructor");
        System.out.println("Constructor 3");

    }
    public StaticNonStaticBlocks02(boolean isOld){
        //System.out.println("I am constructor");
        System.out.println("Constructor 4");
    }
    // Non Static Block constructorlarda calistirilmasi gereken ortak kodlari icerir.
    // Non Static block icine yazilan kodlar her seferinde calisir(hepsinde görülür)
    // Birden fazla nonstatic block varsa ustteki önce calistirilir.

    {
        System.out.println("I am constructor-first");
    }
    {
        System.out.println("I am constructor-second");
    }
    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1=new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2=new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3=new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4=new StaticNonStaticBlocks02(false);

    }






}

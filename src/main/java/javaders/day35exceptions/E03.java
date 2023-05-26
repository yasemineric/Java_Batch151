package javaders.day35exceptions;

public class E03 {
    public static void main(String[] args) {
        String s="Java";
        getCharFromString(s,2);//v-- methodu cagiriyoruz
        getCharFromString(s,4);// Log.lara(console.da cikan kirmizi hata aciklamalari)
        // baktigimizda StringIndexOutOfBoundsException hatasi verir.--String de index kullanirken sinir disina ciktin
        //String index out of range: 4--hatamizin detayli aciklamasi
    }
    public static void getCharFromString(String s, int idx){
        //String.lerde olmayan bir index kullanildiginda java StringIndexOutOfBoundsException atar.
     try {
         char ch=s.charAt(idx);
         System.out.println(ch);
     }catch (StringIndexOutOfBoundsException e){
         System.out.println("Olmayan index kullandiniz :"+e.getMessage());
         System.out.println(e.getCause());//null--Eger tanimli ise hatanin sebebini bildirir
         e.printStackTrace();// Hatayi düzelltik , ama hata aliyormus gibi detaylari görmek icin bu kodu yazariz

     }
        System.out.println("try-catch method görev tamamlandi");

    }
}

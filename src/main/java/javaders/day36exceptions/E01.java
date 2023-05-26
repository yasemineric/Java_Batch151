package javaders.day36exceptions;

public class E01 {
    /*
    * try kisminda  birden fazla exception olusturma ihtimali varsa coklu catch kullanilir.
    * Coklu catch kullandiginizda exception class.lar arasinda Paret-child iliskisi yoksa catch.lerin
    sirasi önemli degildir. Ama code.daki siramalamya uymak tavsiye edilir.
    * Coklu catch kullandiginizda exception class.lar arasinda Paret-child iliskisi varsa
    catch.lerin sirasina dikkat edilmelidir.Child class üstte olmalidir.
    * Exception class.lar arasinda Paret-child iliskisi varsa
             ==> ya child class.i üstte yazarak child ve parent icin özellestirilmis code,lar yazasiniz
             ==> yada child i hic kullanmaz sadece parent ile exceptionlari handle etmeye calisirsiniz.
     */



    public static void main(String[] args) {
        int a=12;
        int b=1;
        String s="My Java";
        getCharFromString(s,a,b);//J


    }
    public static void  getCharFromString(String s, int a, int b){
        try{
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Dont divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız...");

        }

    }




}

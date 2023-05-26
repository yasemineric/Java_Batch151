package javaders.day36exceptions;

public class E03 {
    public static void main(String[] args) {
        Object obj=13;
        try {
            String str=(String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.err.println("Her data type.i her data type.a cevrilmez");
            // err, hatali msj.i kirmizi veriyor, ve bir yerde depoluyor.
            //hata mesajini renkli olarak verir.
            //hataya dair mesajin okunabilirligini artirmak icin System.err.println() kullanilabilir
            //ayrica bu sekilde yazdirdigimizda java error mesajlarini ayri bir yerde depolar
        }

        //Birbirine dönusrulemeyecek data type,larda israr edersek java ClassCastException atar.




    }
}

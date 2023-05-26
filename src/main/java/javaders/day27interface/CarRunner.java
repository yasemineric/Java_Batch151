package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();// Stop methodu static oldugundan interface ismi ile ulastim

        //Engine e=new Engine();--Bu hata verir cünkü abstract method icerdigi icin eksik obje üretir, java kabul etmez
        Honda h= new Honda();
        h.eco();//eco() method.u static olmadigindan(default method)"object" ismi ile ulastim
    }
}

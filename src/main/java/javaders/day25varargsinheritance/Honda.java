package javaders.day25varargsinheritance;

public class Honda extends Car{
    public Honda (){
        super("make");
        System.out.println("Honda 1");
        System.out.println(this.model);// buradaki arac modelini yazdirir--civic
        System.out.println(super.km);// Parent.a git, oradaki km.yi yazdir diyoruz--Car classindan 20000km

    }
    public String model="civic";
    public int km=10000;
}

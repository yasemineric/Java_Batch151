package b151practices.MentorTeam.MT01_Inheritance;

import b151practices.MentorTeam.MT01_Inheritance.Araba;

public class Toyota extends Araba {
    String hiz="Toyota araclar max 200 km hiz yapar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";
    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanir");
    }
    public void yakitTuketimi(){
        System.out.println("Toyota 8.0lt yakit tuketir");
    }

    public void garanti(){
        System.out.println("Toyata araclar 10 yil garantilidir");
    }
}


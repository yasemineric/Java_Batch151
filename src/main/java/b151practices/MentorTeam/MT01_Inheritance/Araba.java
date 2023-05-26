package b151practices.MentorTeam.MT01_Inheritance;

public class Araba {
    public String hareket="Arabalar teker ile hareket eder";
    public String hiz="Arabalar motor gucune göre hiz yapar";
    public String yakit="Arabalar farkli yakitlar kullanabilir";
    public String marka="Arabalar üretildikleri markaya sahiptir";
    String sirketMerkezi="Almanya";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar...");
    }
    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler..");
    }
    public void yil(){
        System.out.println("1996");
    }



}

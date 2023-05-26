package javaders.day22stringbuilder;

public class Student {
    //stdName public oldugu icin diger Class.lardan ulasilabilir.

     public String stdName="Ali Can";


    //Access Modifier.i Public olanclass memberlar, ayni package icinde ayni özellikleri gösterir.
    // Fakat farkli package.a gectiginizde "public" olana ulasilir,default olana ulasilamaz
    int age=23;// default yaptik


    //Access Modifier.i Private olan memberler sadece olusturulduklari Class. icinde görulurler. Clasinin disina cikinca görunmez ulasilmaz olurlar.
    private String healthCondition= "Cancer";

 // Access modifier.i Protected olan member.lar ayni package icinde "public" gibi davranirlar.
    // Farkli Package gectiginizde Protected olanlar sadece Child Class.lardan görülebilir.
    protected int salary =3000;
// Class.lar Default olur(Ama genellikle biz public yapariz) Private olmaz, Protected olmaz cunku Class.lar kaliptir, kullanilsin diye yapilir.




}

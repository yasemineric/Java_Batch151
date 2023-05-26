package javaders.day28interface;

public interface Animal {
    void eat();
    void drink();

   /*
    //Bir interface  içinde abstract method oluşturduğunuzda concrete childlar'ı  mutlaka override edin

    1)interfacelerdeki tum variablelar otomatik(default) olarak "final"dir.
      bu yuzden interface icindeki variablei olusturdugunuzda mutlaka deger atamasi yapmalisiniz.
      bilindigi gibi final variablelarin degerleri degistirilemez.

    2) interfacelerdeki tum variablelar otomatik(default) olarak "public"dir.

    3) İnterfacelerdeki tum variablelar otomatik(default) olarak "static"dir.



    */


    int age=4;




}

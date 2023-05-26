package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception {// Kendimiz bir Exception olusturmak icin Exception classindan extend ederiz.
    /*
    1)Custom Exception Class olusturmak icin Exception Class.a extend etmeliyiz
     Exception Class.a extend ederek olusturtugunuz Custom Exception "Compile Time Exception" olur.

    2) Custom Exception Class olustururken "constructor olusturmalisiniz
     Bu constructor parent.taki constructori cagirmalidir.
     Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3) Custom Exception Class olusturtugunuzda ismin sonunda Exception kelimesini kullanmalisiniz.
    IllegalGradeException.da oldugu gibi

     */
    public IllegalGradeException(String  message){// Burasi istege bagli, istersek msj. veren constructor,
        // yada msj. yazmayan bos constructor yapabiliriz
        super(message);// Bu Parent.a git, objeyi oradan olustur ki, exception objesi olsun
    }


}

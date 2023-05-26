package javaders.day29encapsulation;

public class Student {
    // Encapsulation==> kelime anlami itibariyle kapsüllemek demektir.
    //Encapsulation Data Hiding.dir(Veri Saklamak)
    //Data nasil saklanir?
    // Access modifier.larini private yaparak data-yi diger classlarladan görünmez hale getirerek datayi saklarim.

    private String stdId="AC2023102T";
    //public int age=19;
    private double notOrt=3.53;
    private boolean successfull= false;

    // Encapsulation yaptigimiz datayi istersek diger class.lardan okuyabiliriz.
    // Nasil okuruz?
    // "get method"u olusturarak encapsule edilmis datanin degerini okuyabiliriz
    // generate-getter- kilitli method.lardan birini sec. private kismi public yapmis olarak yeniden verir.
    //Ve baska class.lardan da görulebilir artik.

    // get method.lar public olur.
    // get methodun return type.i okudugu variable.in retun type.i ile ayni olur.
    // get methodu bir boolean variable icin olusturulduysa ismi "is" ile baslar.(isSuccessfull)

    //Encapsulation yaptigimiz datayi istersek diger class.lardan degistirebiliriz.
    //Nasil degistirebiliriz?
    //"set method" olusturarak encapsule ettigimiz datanin degerini degistirebiliriz.
       //a) Set methodlari herzaman public olur.
       //b) Set methodlarin return type.i her zaman void olur.
       //c) Set method parametre kullanir, parametrenin data type.i variable ile ayni olmak zorundadir.

    //iv)set method kullanarak var olan object uzerinde degisiklikler yaparak o objeyi yeni bir objeymis gibi kullanabiliriz
    //Note: get method'larin diger adi "getter", set method'larin diger adi "setter"dir

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessfull() {
        return successfull;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessfull(boolean successfull) {
        this.successfull = successfull;
    }


    //--------------------------Kitaptan örnek---------------------
    private String gender = "Male";
    private int age = 23;
    private boolean disabled = false;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isDisabled() {
        return disabled;
    }
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    public String getGender() {
        return gender;
    }






}

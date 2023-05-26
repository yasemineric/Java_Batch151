package javaders.day29encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.getStdId());//AC2023102T--Getter methodu kullandigimiz icin studentID.ye ulasabildik
        System.out.println(s1.getNotOrt());//3.53
        System.out.println(s1.isSuccessfull());//false

        System.out.println("----------------------");

        s1.setNotOrt(4.99);// eski hali 3.53, set methodu ile 4.99 olarak yeniledik,
        // ama bu s1 obje üzerinde bulunan variable.da degisti. Class.daki orijinal ortalama degismedi.
        s1.setSuccessfull(true);
        s1.setStdId("MU123456");

        System.out.println(s1.getNotOrt());
        System.out.println(s1.getStdId());
        System.out.println(s1.isSuccessfull());

        System.out.println("---------------------");

        s1.setStdId("DH313756");
        s1.setNotOrt(4.5);
        s1.setSuccessfull(true);

        System.out.println(s1.getNotOrt());
        System.out.println(s1.getStdId());
        System.out.println(s1.isSuccessfull());




    }
}

package b151practices.smallStudyGroup.methodCreation;

public class SchoolRunner {
    public static void main(String[] args) {
        School okul=new School();
        System.out.println(okul.okulIsmi);
        System.out.println(okul.isAktive);
        System.out.println(okul.yil);
        okul.okulIsmiYazdir();
        System.out.println(okul.okulIsmiYazdir());
        okul.isAktiveMi();
       okul.okulYiliYazdir();


    }
}

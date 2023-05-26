package javaders.day22stringbuilder;

public class StudentRunner {

    public static void main(String[] args) {
        Student std1=new Student();// Student Name.e ulasmak icin Obje olusturmaliyiz, cunku StdName Static degil.
        System.out.println(std1.stdName);

        System.out.println(std1.age);// default olan age buradan da ulasilir. Cunku StudentRunner class.i Student Class.i ile ayni package icindeler.Ayni Pacage icerisinde Default ile Public arasinda fark yoktur.
     //burada std1. yapinca stdName cikar, age cikar ama healthCondition cikmaz, cünkü o private.dir





    }
}

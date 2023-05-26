package javaders.day18NTstaticconstructorskeyword;

public class StudentRunner {
    public static void main(String[] args) {
        // Static olan numOfRegisteredStudent variable.ni cagirmak icin sadece class ismini kullandik obje olusturmadik
        System.out.println(Student.numOfRegisteredStd);// Burada . dan sonra sadece static olanlari görururz

        // Static olamayan num variable.ni cagirmak icin object olusturduk
        Student s1=new Student();// burada obje olusturursak static olmayanlari da . dan sonra görebiliriz
        System.out.println(s1.num);

      // Static olan "numOfRegisteredStudent"variable.na object uzerinden de ulasilabilir ama bu hatadir

        // mesela Arrays class inda sort methodu static tir Arrays class i ile ulasabiliriz.
        //String class inda valueoff, join gibi methodlar statictir ama mesela uppercase fln static degildir
        //ona ulasmak icin once String s= "Ali" ; digerek obje olusturmamiz gerekiyor.


    }

}

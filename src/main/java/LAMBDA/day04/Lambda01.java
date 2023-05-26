package LAMBDA.day04;

import javaders.day30abstraction.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        //Simdi Course Class.indan obje olusturacagiz. O nedende Course önce yazilir

        Course  turkishDay= new Course("Turkish Daytime QA", 213, "Spring", 97);
        Course  turkishNight= new Course("Turkish Nighttime QA", 245, "Winter", 98);
        Course  englishDay= new Course("English Daytime Java Dev", 121, "pring", 91);
        Course  englishNight= new Course("English Nighttime Java Dev", 137, "Winter", 95);

        List<Course> courseList= new ArrayList<>();// Lambda.yi listelerle kullanabiliriz
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);
        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));//true
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));//true
        System.out.println(getCourseNamesWhoseAvgMax(courseList));//Turkish Nighttime QA
        System.out.println(getCourseBetterThanLastTwo(courseList));//[Course{courseName='Turkish Daytime QA', numOfStudents=213,
        // season='Spring', averageScore=97.0},
        // Course{courseName='Turkish Nighttime QA',
        // numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getHighestThird(courseList));//Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList, 150));//[Course{courseName='English Daytime Java Dev',
        // numOfStudents=121, season='pring', averageScore=91.0},
        // Course{courseName='English Nighttime Java Dev', numOfStudents=137,
        // season='Winter', averageScore=95.0}]
    }

    //Example: Tüm average scorlarin 90.dan büyük olup olmadigini kontrol eden kod yaziniz
      public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList,int avg){
      return courseList.
              stream().
              allMatch(t->t.getAverageScore()>avg);
}

    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word){
        return courseList.
                stream().
                anyMatch(t->t.getCourseName().contains(word));
    }

    ////Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
    public static String getCourseNamesWhoseAvgMax (List<Course>courseList){
       Course course= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();// findFirst() methodu Optional.dir, o isimize yaramaz, get() methodu da eklemeliyiz.
        //return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();
        // Bu eriyi bir kere kullanacaksak böyle de direkt yazdirilabilir( Course course ve return  course.getCourseName(); kullanmadan)
        return  course.getCourseName();
        //Ama veriyi tekrar tekrar kullanacaksak course konteyner.i acmak mantikli
    }

    //Example 4: Average _Scoru en düsük ilk iki course disindaki tüm kurlari return eden method olusturunuz.
    public static List<Course> getCourseBetterThanLastTwo(List<Course>courseList){
        // Basta data tipini Sadece Course secseydik sadece 1 tane course getirirdi. O nedenle List <Course> yazarak kurs listesini aldik

        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
        //skip(2) method.u istedigimiz kadarini es gecmemizi saglar.

    }

    //Example 5: Average Score.u üstten ücüncü olan kursu veren methodu olusturunuz.
    public static Course getHighestThird(List<Course>courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).// Limit() method.unda 1 yazarsak geri kalanlarin ilkini, 2 yazarsak ilk ikiyi, 3 yazarsak ilk 3. verir
                collect(Collectors.toList()).
                get(0); //Listin icerisinde bir sürü kurs adi var, "get(0)" yazarak ilk elemani almis oluruz
    }

    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course>courseList, int numOfStd){
        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());

    }



}

package b151practices.advancedPrectise.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectStudentLambda {
    public static void main(String[] args) {


    Scanner input=new Scanner(System.in); // tabnine ile otomatik yazdir--arastir???
        System.out.println("Lütfen ögrenci sayisini giriniz");
    int numStd=input.nextInt();

    List<Student> students=new ArrayList<>();// ArrayList secme sebebimiz daha hizli olmasi, ve memory.de daha az yer kaplar.
    //Burada Data tipini Student seciyoruz, cünkü verileri Student Class.indan cekecegim.
        for (int i = 0; i <numStd ; i++) {
        System.out.println("isim: ");
        String name= input.next();
        System.out.println("cinsiyet: ");
        String gender= input.next().toUpperCase().trim().substring(0,1);

        System.out.println("boy: ");
        double height= input.nextDouble();
        System.out.println("kilo: ");
        double weight= input.nextDouble();
        Student student=new Student(name,gender,height,weight);// Her döngude aldigi bilgiyi student objesine atadi

        students.add(student);// Verilen bilgileri students listesine ekliyoruz

    }//for i
       // Lambda method create etme degil, mevcut methodlari library'den cagirip kullanmaktir.
        // hiz,clean code ve okunabilirlilik acisindan onemlidir
        //Iterator'lar loop'larin yaptigi ayni isi yapar.

long time1=System.nanoTime();
        List<Student> selectedStudent=Stream.concat(students. //concat() methodu ile filtreledigimiz kadin ve erkek ögrenci verilerini birlestiriyoruz.
                        stream().
                        filter(t->t.getGender().equals("K")&&t.getHeight()>1.50&&t.getWeight()>50&&t.getWeight()<70 ),
                students.
                        stream().
                        filter(t->t.getGender().equals("E")&&t.getHeight()>1.60&&t.getWeight()>70&&t.getWeight()<90 )).
                collect(Collectors.toList());

        if (selectedStudent.isEmpty()){
            System.out.println("Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        }else {
            System.out.println("=====================Kursa Secilen Ögrenciler==================");
            selectedStudent.forEach(t-> System.out.println(" isim : "+t.getName()+
                                                         " cinsiyet : "+t.getGender()+
                                                         " boy : "+t.getHeight()+
                                                         " kilo : "+t.getWeight()));
        }


        long time2=System.nanoTime();
        long functionalProggramming=time2-time1;
        System.out.println("functionalProggramming/1000 = " + functionalProggramming/1000 +" nano saniye");
        //lambda =34782
        //java = 36800
       // Lambda bir tik daha hizli calidir,
        // performans olarak cok karmasik durumlarin oldugu code.larda Lambda tavsiye edilir

    }
}

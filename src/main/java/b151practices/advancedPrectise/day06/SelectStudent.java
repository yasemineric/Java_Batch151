package b151practices.advancedPrectise.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectStudent {
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
        long time1=System.nanoTime();

        List<Student> selectedStudents= new ArrayList<>();//Buraya verileri students listesinden getirecegiz
        for (Student student: students) {
            if (student.getGender().equals("K")&& student.getHeight()>1.50&&student.getWeight()>50&&student.getWeight()<70){
               selectedStudents.add(student);

            } else if (student.getGender().equals("E")&& student.getHeight()>1.60&&student.getWeight()>70&&student.getWeight()<90){
                selectedStudents.add(student);
            }

        } //for each

        System.out.println("=====================Kursa Secilen Ögrenciler==================");
        if (selectedStudents.size()==0){
            System.out.println("Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        }else{
            for (Student student:selectedStudents) {
                System.out.println(student.toString());

            }
        }


        long time2=System.nanoTime();
        long javaTime=time2-time1;
        System.out.println("javaTime/1000 = " + javaTime/1000+ " nano saniye");
        //javaTime/1000=43311 nano saniye


    }
}

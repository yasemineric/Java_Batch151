package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {
        // Wie hergestellt der Objekt
        // Class Name+ Objekt Name+ Assignment Operator+new+ Constructor
        Car myCar = new Car();
        // New Keywordu sifirdan yeni bir obje olusturmak icin kullanilir.
        //Constructor java da nesneleri olusturmak icin kullanilan özel bir methoddur. Her zaman constructor olustururken classin ismini yazip parantez koyuyoruz.

        System.out.println(myCar.price);
        System.out.println("myCar.model = " + myCar.model);
        myCar.bewegung();
        myCar.stop();

        Student tomHanks = new Student();
        System.out.println("tomHanks.address = " + tomHanks.address);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.name = " + tomHanks.name);

        tomHanks.feed();
        tomHanks.study();

        byte grade =tomHanks.grade;
        System.out.println("grade = " + grade);

        String name =tomHanks.name;
        System.out.println("name = " + name);


    }

}

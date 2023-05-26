package javaders.day26polymorphism;

public class Cat extends Animal {
    public void meow() {
        System.out.println("Cats meow");
    }

    @Override//Override Annotation override kurallarinin java tarafindan kontrol edilmesini saglar
    public void eat() {
        //Child.daki override edilmis eat() methoduna "Overriding Method" denir.
        //Parent.daki override edilmis eat() methoduna "Overriden Method" denir.
        System.out.println("Cats eat");
    }
    @Override
    public void trink(){
        System.out.println("Cat trink");
    }

    @Override
    public Animal create() {// Animal has a Cat
        return new Cat(); // Cat is a Animal--Cat.-i Animal sepetine koyabiliriz
        //-- new ne zaman görürsek anlamaliyiz ki, yanindaki konstructor ile obje üüretiyoruz.
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }







}

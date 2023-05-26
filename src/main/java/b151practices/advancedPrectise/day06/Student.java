package b151practices.advancedPrectise.day06;

public class Student {
    private String name;
    private String gender;
    private double height;
    private double weight;

    public Student(String name, String gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {// yazdirmak icn bunu Generate--ToString kullanarak yapiyoruz
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }




}

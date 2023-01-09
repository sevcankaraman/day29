package day22staticblocksconstructors_tekrar;

public class Student {
    String name;
    int age;
    int grade;
    String Id;
    String adress;

    public Student(String name, int age, int grade, String id, String adress) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        Id = id;
        this.adress = adress;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", Id='" + Id + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

package week10;

public class Student {
    String name;
    String id;
    int grade;

    public void study(){
        System.out.println(name + " su an ders calisiyor...");
    }

    public void passYear(){
        grade = grade + 1;
        System.out.println(name + " sinifi gecti. Yeni sinifi gecti: " + grade);
    }

    public static void main(String[] args) {
            Student student1 = new Student();
            student1.name = "Alp";
            student1.id = "2002";
            student1.grade = 1;

            student1.study();
            student1.passYear();
    }
}

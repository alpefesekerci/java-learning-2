package week10;

public class DataTypes {
    static void main(String[] args) {
        String studentName = "Alp";
        int studentAge = 23;
        boolean studentGender = false;
        String studentId = "2002";

        System.out.println("Ogrencinin adi: " + studentName);
        System.out.println("Ogrencinin yasi: " + studentAge);
        System.out.println("Ogrencinin cinsiyeti: " + (studentGender ? "kız" : "erkek"));
        System.out.println("Ogrencinin okul numarasi: " + studentId);
    }
}

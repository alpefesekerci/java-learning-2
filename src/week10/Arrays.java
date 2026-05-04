package week10;

public class Arrays {
    static void main(String[] args) {
        String[] validIds = {"2000","2001","2002"};
        System.out.println("Ilk ID: " + validIds[0]);
        validIds[1] = "1999";
        System.out.println("Ikinci ID: " + validIds[1]);
        validIds[2] = "null";
        System.out.println("Ucuncu ID: " + validIds[2]);
    }
}

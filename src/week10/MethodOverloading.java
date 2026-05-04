package week10;

public class MethodOverloading {
    public static void printData(String text){
        System.out.println("Metin: " + text);
    }
    public static void printData(int number){
        System.out.println("Sayi: " + number);
    }

    static void main(String[] args) {
        printData("Merhaba");
        printData(10);
    }
}

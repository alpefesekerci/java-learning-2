package week10;

public class MathOperators {
    static void main(String[] args) {
        double radius = 2.18;
        double area = Math.PI * Math.pow(radius, 2);
        int roundedArea = (int) area;

        System.out.println("The are is approximately " + roundedArea);
    }
}

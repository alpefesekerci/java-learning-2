package week10;

public class Methods {
    public static int calculateArea(int width,int height){
        return width * height;
    }

    static void main(String[] args) {
        int area = calculateArea(10,20);
        System.out.println("Alan: " + area);
    }
}


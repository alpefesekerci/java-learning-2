package week10;
import java.util.Arrays;

public class toString {
    static void main() {
        String[] validIds = {"1","2","3"};
        String[] newArrays = new String[3];

        newArrays[0]="4";
        newArrays[1]="5";
        newArrays[2]="6";

        System.out.println(Arrays.toString(validIds));
        System.out.println(Arrays.toString(newArrays));
    }
}

import java.util.*;

public class Pyramid {

    public static void main(String args[]) {

        int n = 5;

        // outer
        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // integer- print row no , no times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
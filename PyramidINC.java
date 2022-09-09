import java.util.*;

public class PyramidINC {
    public static void main(String args[]) {

        int n = 5;
        // outer
        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // digit i---1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // digit 2--i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

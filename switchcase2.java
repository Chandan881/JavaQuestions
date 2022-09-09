import java.util.*;

public class switchcase2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {

            case 1:
                System.out.println("RIGHT");
                break;

            case 2:
                System.out.println("LEFT");
                break;

            case 3:
                System.out.println("UP-DOWN");
                break;

            default:
                System.out.println("DEFAULT");

        }
    }
}
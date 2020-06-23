import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-17
 */
public class CF732_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            int remainder = (k * i) % 10;
            if (remainder == 0 || remainder == r) {
                System.out.println(i);
                break;
            }
        }

    }
}

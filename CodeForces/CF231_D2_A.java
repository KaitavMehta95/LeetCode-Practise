import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-05-26
 */
public class CF231_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solutions = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (sc.nextInt() == 1) {
                    count = count + 1;
                }
            }
            if (count >= 2) {
                solutions += 1;
            }
        }
        System.out.println(solutions);

    }
}

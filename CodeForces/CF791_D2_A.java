import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-05-26
 */
public class CF791_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;
        while (a <= b) {
            years = years + 1;
            a = a * 3;
            b = b * 2;
        }

        System.out.println(years);
    }
}

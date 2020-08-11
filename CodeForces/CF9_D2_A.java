import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-23
 */
public class CF9_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int max;
        max = Math.max(x, y);
        int num = 6 - max + 1;
        int denominator = 6;
        if (denominator % num == 0) {
            denominator = denominator / num;
            num = 1;
        } else if (num % 2 == 0) {
            denominator = denominator / 2;
            num = num / 2;
        }
        System.out.println(num + "/" + denominator);
    }
}

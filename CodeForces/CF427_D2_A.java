import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF427_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long count = sc.nextLong();

        long police = 0;
        long crime = 0;
        for (int i = 0; i < count; i++) {
            int event = sc.nextInt();
            if (event != -1) {
                police = police + event;
            } else {
                if (police > 0) {
                    police = police - 1;
                } else {
                    crime += 1;
                }
            }

        }


        System.out.println(crime);
    }
}

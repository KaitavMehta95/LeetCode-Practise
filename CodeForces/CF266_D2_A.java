import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF266_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String stones = sc.next();
        Character prev = null;
        int remove = 0;
        for (Character c : stones.toCharArray()) {
            if (prev == null) {
                prev = c;
            } else if (c.equals(prev)) {
                remove = remove + 1;

            } else {
                prev = c;
            }

        }

        System.out.println(remove);

    }
}

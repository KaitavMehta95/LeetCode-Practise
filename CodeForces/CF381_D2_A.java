import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF381_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cards.add(sc.nextInt());
        }
        int playerA = 0;
        int playerB = 0;
        for (int i = 0; i < count; i++) {
            Integer max = cards.get(0) > cards.get(cards.size() - 1) ? cards.get(0) : cards.get(cards.size() - 1);
            cards.remove(max);

            if (i % 2 == 0) {
                playerA += max;
            } else {
                playerB += max;
            }
        }

        System.out.println(playerA + " " + playerB);

    }
}

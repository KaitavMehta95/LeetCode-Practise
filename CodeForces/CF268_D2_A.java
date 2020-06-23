import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-17
 */
public class CF268_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int teams = sc.nextInt();
        Map<Integer, Integer> hostColorCount = new HashMap<>();
        Map<Integer, Integer> guestColorCount = new HashMap<>();

        for (int i = 0; i < teams; i++) {
            int hostColor = sc.nextInt();
            int guestColor = sc.nextInt();
            int hostCount = hostColorCount.getOrDefault(hostColor, 0) + 1;
            hostColorCount.put(hostColor, hostCount);
            int guestCount = guestColorCount.getOrDefault(guestColor, 0) + 1;
            guestColorCount.put(guestColor, guestCount);
        }

        int match = 0;
        for (Integer hostColor : hostColorCount.keySet()) {

            if (guestColorCount.containsKey(hostColor)) {
                match = match + hostColorCount.get(hostColor) * guestColorCount.get(hostColor);
            }
        }
        System.out.println(match);
    }
}

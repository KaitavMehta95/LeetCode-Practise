package OA;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaitavmehta created on 2020-09-20
 */
public class Amz {
    public static void main(String args[]) {

        System.out.println(helper(new int[]{37, 23, 60}));
    }

    public static int helper(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : time) {
            int d = (60 - t % 60) % 60;
            System.out.println(d);
            if (count.containsKey(d)) {
                ans += count.get(d);
            } // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0)); // update the number of t % 60.
        }
        return ans;
    }
}

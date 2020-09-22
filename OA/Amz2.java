package OA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaitavmehta created on 2020-09-20
 *
 * Wrong requires to improve the time complexity
 */
public class Amz2 {
    public static <Char> void main(String args[]) {


    }
//    s = '|**|*|*'
    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        char pipe = '|';
        char starr = '*';
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < startIndices.size(); i++) {
//            int start = startIndices.get(i);
//            int end = endIndices.get(i);
            int temp = 0;
            int pipeCount = 0;
            int totalStars = 0;
            for (char c : s.toCharArray()) {

                if (c == pipe && pipeCount == 1) {
                    totalStars += temp;
                    temp = 0;
                } else if (c == starr && pipeCount == 1) {
                    temp++;
                } else if (c == pipe) {
                    pipeCount = 1;
                }

                result.add(totalStars);
            }
        }

        return result;
    }
}

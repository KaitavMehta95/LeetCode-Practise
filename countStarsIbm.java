/**
 * @author kaitavmehta created on 2020-02-16
 */

// compiler design test- requires optimization 
// do mutiple star search in one loop
public class countStarsIbm {

    public static int helperFunction(String s, int start, int end) {
        // check for |
        // count // even pe delete

        start = start - 1;
        int validCount = 0;
        boolean inZone = false;
        char pipe = '|';
        char star = '*';

        int rangeCount = 0;
        for (int i = start; i < end; i++) {

            if (s.charAt(i) == pipe) {
                if (inZone) {
                    inZone = false;
                    validCount = validCount + rangeCount;
                }
                // false- true
                if (!inZone) {
                    inZone = true;
                }
                rangeCount = 0;
            }
            if (inZone && s.charAt(i) == star) {
                rangeCount = rangeCount + 1;

            }

        }
        return validCount;
    }

    public static void main(String args[]) {

        System.out.println("");
        String s = "|**|*|*";

        int[] startIndex = {1, 1};
        int[] endIndex = {4, 3};
        int n = 1; // min size
        int count = 0;

        for(int i =0; i< n; i++) {
            count = count + helperFunction(s, startIndex[i], endIndex[i]);
        }

        System.out.println(count);

    }


}

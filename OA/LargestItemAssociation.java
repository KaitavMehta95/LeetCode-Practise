package OA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author kaitavmehta created on 2020-09-15
 */
// Todo revisit later
public class LargestItemAssociation {
    public static void main(String args[]) {


        // All item that are linked together by an item association can be considered in the same group.


        // no assocation - > will have size 1


        // algo - for largest item association

        // If two  groups have same number of item then select group which contains the itnem that appears in lexographic order

        List<PairString> itemAssocations = Arrays.asList(new PairString("item1", "item2"),
                new PairString("item3", "item4"),
                new PairString("item4", "item5"));

        System.out.println(largestItemAssociation(itemAssocations));
    }

    public static List<String> largestItemAssociation(List<PairString> itemAssociation) {
        // write your code here
        // make groups
        // for each pair -> iterate over other pair
        // and make groups
        List<List<String>> groups = new ArrayList<>();

        int maxSize = -1;
        // todo N2 - can I reduce complexity here?

        for (PairString p : itemAssociation) {
            List<String> g = new ArrayList<>();
            g.add(p.first);
            g.add(p.second);
            for (PairString p1 : itemAssociation) {
                if (p != p1) {
                    // make groups
                    if (g.contains(p1.first)) {
                        g.add(p1.second);
                    } else if (g.contains(p1.second)) {
                        g.add(p1.first);
                    }
                }
            }
            groups.add(g);
            int size = g.size();
            if (size > maxSize) {
                maxSize = size;
                groups = new ArrayList<>();
                groups.add(g);
            } else if (size == maxSize) {
                groups.add(g);
            }

        }
        Collections.sort(groups.get(0));
        for(List<String> a: groups){
            System.out.println(a);
        }
        return groups.get(0);
    }

    public static class PairString {
        String first;
        String second;

        public PairString(String first, String second) {
            this.first = first;
            this.second = second;
        }
    }

}



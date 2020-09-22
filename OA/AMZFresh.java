package OA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kaitavmehta created on 2020-09-15
 */
public class AMZFresh {
    public static void main(String args[]) {

        // code list -  groups of fruits
        // group list - order of fruits

        // Both the order of the groups within the code list and order of the fruits within the groups matters.

        // Iterate over shopping cart
        System.out.println(isWinner());

    }

    public static int isWinner() {
        // List of all groups - if fails then start the list index to zero
        List<List<String>> codeList = new ArrayList<>(Arrays.asList(Arrays.asList("apple", "apple"), Arrays.asList("banana", "anything", "banana")));
        List<String> shoppingList = new ArrayList<>(Arrays.asList("anything", "orange", "apple", "apple", "anything", "banana", "orange", "banana"));

        if (codeList == null || codeList.size() == 0) {
            return 1;
        }
        if (shoppingList == null || shoppingList.size() == 0) {
            return 0;
        }

        int codeListIndex = 0;
        List<String> codes = codeList.get(codeListIndex);

        int start = 0, end = 0, codeIdx = 0;
        while (end < shoppingList.size()) {

            if (codes.get(codeIdx).equals("anything") || codes.get(codeIdx).equals(shoppingList.get(end))) {
                codeIdx++;
                end++;
            } else {
                codeIdx = 0;
                start = ++end;
            }

            if (codeIdx == codes.size()) {
                codeListIndex++;
                if (codeListIndex == codeList.size()) {
                    return 1;
                } else {
                    codes = codeList.get(codeListIndex);
                    codeIdx = 0;
                    end = start;
                }
            }

        }

        return 0;
    }
}

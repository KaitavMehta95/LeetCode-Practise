package OA;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author kaitavmehta created on 2020-09-16
 */
public class MostCommonWord {
    public static void main(String args[]) {

        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        List<String> bannedList = Arrays.asList(banned);

        String[] words = paragraph.replaceAll("\\p{Punct}", " ").toLowerCase().split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : words) {
            if(s.isEmpty()){
                continue;
            }
            if (!bannedList.contains(s)) {
                int count = wordCount.getOrDefault(s, 0);
                count++;
                wordCount.put(s, count);
                System.out.println(s+ " count "+ count);
            }
        }

        Entry<String, Integer> maxEntry = Collections.max(wordCount.entrySet(), Entry.comparingByValue());

        System.out.println(maxEntry.getKey());
    }
}

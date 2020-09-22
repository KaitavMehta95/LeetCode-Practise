package OA;

import java.util.*;

/**
 * @author kaitavmehta created on 2020-09-20
 */
public class TopNCompetitors {
    public static void main(String args[]) {


        int numOfCompetitors = 6;
        String[] competitors = {"newshop", "shopnow", "afashion", "fashionbeats", "mymarket", "tcellular"};
        int numOfReviews = 6;
        String[] reviews = {
                "newshop is providing good services in the city; everyone should use newshop",
                "best services by newshop",
                "fashionbeats has great services in the city",
                "I am proud to have fashionbeats",
                "mymarket has awesome services",
                "Thanks Newshop for the quick delivery"};

        int topNCompetitors = 2;

        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (e1, e2) -> e1.getValue().equals(e2.getValue()) ? e2.getKey().compareTo(e1.getKey()) : e2.getValue().compareTo(e1.getValue()));

        List<String> competitorsList = Arrays.asList(competitors);
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String review : reviews) {
            String[] reviewWords = review.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");

            for (String word : reviewWords) {
                if (competitorsList.contains(word)) {
                    int count = wordCounts.getOrDefault(word, 0);
                    count += 1;
                    wordCounts.put(word, count);
                }

            }
        }

        maxHeap.addAll(wordCounts.entrySet());

        for (int i = 0; i < topNCompetitors; i++) {
            System.out.println(maxHeap.poll().getKey());
        }

    }
}

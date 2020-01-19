import java.util.*;

public class TopNBuzzWord {

    public static void main(String args[]) {
        
        int numToys = 6;
        int topToys = 2;
        String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
        int numQuotes = 6;
        String[] quotes = {
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"
        };

        // add error conditions
        // TreeMap of toys- key, count
        Map<String, Integer> buzWordMap = new TreeMap<>();

        for (String toy : toys) {
            buzWordMap.put(toy, 0);
        }

        for (String quote : quotes) {
            String[] quoteWords = quote.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");
            for (String word : quoteWords) {
                if(buzWordMap.containsKey(word)){
                    buzWordMap.put(word,buzWordMap.get(word)+1);
                }
            }

        }

        System.out.println(buzWordMap.toString());
        // get top N

        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                (e1, e2) -> e1.getValue() == e2.getValue() ? e1.getKey().compareTo(e2.getKey()) :
                        Integer.compare(e1.getValue(), e2.getValue()));

        for (Map.Entry<String, Integer> e : buzWordMap.entrySet()) {
            minHeap.offer(e);
            if (minHeap.size() > topToys) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()){
            result.add(0,minHeap.poll().getKey());
        }

        System.out.println(result);


    }
}

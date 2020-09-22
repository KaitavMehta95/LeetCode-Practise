package OA;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author kaitavmehta created on 2020-09-19
 *
 * Todo instead use maxheap PQ and generate the ration for an incremented
 * Interesting : total review - total five start / total review / total review + 1
 * UNDERSTAND THE RATION IN DETAIL
 * WARNING GIVES WRONG ANSWER
 */
public class ProductRating {


    public static void main(String args[]) {
        List<List<Integer>> productRatings = new ArrayList<>();
        List<Integer> reviews = new ArrayList<>();
        reviews.add(4);
        reviews.add(4);
        productRatings.add(reviews);

        reviews = new ArrayList<>();
        reviews.add(1);
        reviews.add(2);
        productRatings.add(reviews);

        reviews = new ArrayList<>();
        reviews.add(3);
        reviews.add(6);
        productRatings.add(reviews);

        int totalProducts = productRatings.size();
        int ratingsThreshold = 77;

        Map<Integer, Float> percentages = new HashMap<>();
        PriorityQueue<Map.Entry<Float, List<Integer>>> maxHeap = new PriorityQueue<>();
        float[] individualPercentage = new float[totalProducts];
        for (List<Integer> review : productRatings) {
            float percentage = review.get(0) * 100F / review.get(1);
            percentages.put(productRatings.indexOf(review), percentage);
            individualPercentage[productRatings.indexOf(review)] = percentage;
        }
        float totalPercentage = 0;
        for (float v : individualPercentage) {
            totalPercentage = totalPercentage + v;
        }
        float threshold = totalPercentage / totalProducts;

        System.out.println(threshold);
        int newStars = 0;
        while (threshold < ratingsThreshold) {
            Entry<Integer, Float> minEntry = Collections.min(percentages.entrySet(), Entry.comparingByValue());
            System.out.println(minEntry);
            int index = minEntry.getKey();
            List<Integer> review = productRatings.get(index);

            review.set(0, review.get(0) + 1);
            review.set(1, review.get(1) + 1);

            float newPercentage = review.get(0) * 100F / review.get(1);
            percentages.put(index, newPercentage);

            totalPercentage = totalPercentage - individualPercentage[index] + newPercentage;
            individualPercentage[index] = newPercentage;

            threshold = totalPercentage/totalProducts;
            System.out.println(threshold);
            newStars++;

        }

        System.out.println("Total min 5 stars required are " + newStars);

    }
}

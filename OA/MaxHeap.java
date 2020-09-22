package OA;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author kaitavmehta created on 2020-09-15
 */
public class MaxHeap {
    public static void main(String args[]) {
        PriorityQueue<Map.Entry<Float, List<Integer>>> maxHeap = new PriorityQueue<>(
                Map.Entry.comparingByKey(Collections.reverseOrder()));
        Map<Float, List<Integer>> val = new HashMap<>();

        List<Integer> reviews = new ArrayList<>();
        reviews.add(1);
        reviews.add(2);
        val.put(0.05F, reviews);

        reviews = new ArrayList<>();
        reviews.add(3);
        reviews.add(6);
        val.put(0.07F, reviews);


        reviews = new ArrayList<>();
        reviews.add(4);
        reviews.add(4);
        val.put(0.00F, reviews);

        maxHeap.addAll(val.entrySet());

        System.out.println(maxHeap.poll().getKey());
        System.out.println(maxHeap.poll().getKey());
        System.out.println(maxHeap.poll().getKey());
    }



}



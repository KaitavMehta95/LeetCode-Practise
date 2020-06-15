import java.util.*;

/**
 * @author kaitavmehta created on 2020-06-10
 */
public class CF731_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.next();

        Map<Character, Integer> letterIndexMap = new HashMap<>();
        letterIndexMap.put('a', 1);
        letterIndexMap.put('b', 2);
        letterIndexMap.put('c', 3);
        letterIndexMap.put('d', 4);
        letterIndexMap.put('e', 5);
        letterIndexMap.put('f', 6);
        letterIndexMap.put('g', 7);
        letterIndexMap.put('h', 8);
        letterIndexMap.put('i', 9);
        letterIndexMap.put('j', 10);
        letterIndexMap.put('k', 11);
        letterIndexMap.put('l', 12);
        letterIndexMap.put('m', 13);
        letterIndexMap.put('n', 14);
        letterIndexMap.put('o', 15);
        letterIndexMap.put('p', 16);
        letterIndexMap.put('q', 17);
        letterIndexMap.put('r', 18);
        letterIndexMap.put('s', 19);
        letterIndexMap.put('t', 20);
        letterIndexMap.put('u', 21);
        letterIndexMap.put('v', 22);
        letterIndexMap.put('w', 23);
        letterIndexMap.put('x', 24);
        letterIndexMap.put('y', 25);
        letterIndexMap.put('z', 26);

        Integer prevCharIndex = 1;
        int rotation = 0;
        for (Character c : message.toCharArray()) {
            int rotateClockWise = Math.abs(letterIndexMap.get(c) - prevCharIndex);
            int rotateCounterClockWise = Math.abs(26 - rotateClockWise);

            if(rotateClockWise < rotateCounterClockWise){
                rotation += rotateClockWise;
            } else {
                rotation += rotateCounterClockWise;
            }

           prevCharIndex = letterIndexMap.get(c);

        }

        System.out.println(rotation);

    }
}

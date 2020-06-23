import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-23
 */
public class CF265_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String instruction = sc.next();

        char[] inputArray = input.toCharArray();
        char[] moves = instruction.toCharArray();

        int stoneCount = 1;
        int index = 0;
        char currentChar = inputArray[index];
        for (char move : moves) {
            if (currentChar == move) {
                stoneCount += 1;
                index += 1;
                currentChar = inputArray[index];
            }
        }

        System.out.println(stoneCount);


    }
}

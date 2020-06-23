import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-23
 */
public class CF228_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> shoes = new ArrayList<>();
        int addNewPair = 0;
        for (int i = 0; i < 4; i++) {
            int color = sc.nextInt();
            if (shoes.contains(color)) {
                addNewPair += 1;
            } else {
                shoes.add(color);
            }
        }

        System.out.println(addNewPair);

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-05-26
 */
public class CF405_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cubes = new int[n];
        for (int i = 0; i < n; i++) {
            cubes[i] = sc.nextInt();
        }
        Arrays.sort(cubes);
        String cubeAfterGravity = null;
        for (int i = 0; i < n; i++) {
            if (cubeAfterGravity == null) {
                cubeAfterGravity = String.valueOf(cubes[i]);
            } else {
                cubeAfterGravity = cubeAfterGravity + " " + cubes[i];

            }
        }

        System.out.println(cubeAfterGravity);

    }
}

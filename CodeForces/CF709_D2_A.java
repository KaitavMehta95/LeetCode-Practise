import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-29
 */
public class CF709_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oranges = sc.nextInt();
        int maxSize = sc.nextInt();
        int wasteSize = sc.nextInt();

        int currentWaste = 0;
        int clearWaste = 0;
        for(int i =0; i< oranges; i++){
            int orange = sc.nextInt();

            if(orange > maxSize){
                continue;
            }

            currentWaste += orange;

            if(currentWaste > wasteSize){
                currentWaste  = 0;
                clearWaste += 1;
            }

        }
        System.out.println(clearWaste);
    }
}

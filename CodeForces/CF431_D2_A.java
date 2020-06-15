import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-09
 */
public class CF431_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> calories = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            calories.add(sc.nextInt());
        }

        String seconds = sc.next();
        int cal = 0;
        for(String sec: seconds.split("")){
            int secInt = Integer.parseInt(sec);
            cal += calories.get(secInt-1);
        }

        System.out.println(cal);

    }
}

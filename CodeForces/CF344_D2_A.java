import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF344_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int magnets = sc.nextInt();
        String prev = sc.next();
        int groups = 1;
        for (int i = 1; i < magnets; i++) {
            String current = sc.next();
            if (!prev.equals(current)){
                groups +=1;
                prev = current;
            }
        }

        System.out.println(groups);

    }
}

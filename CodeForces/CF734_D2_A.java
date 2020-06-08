import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-05-26
 */
public class CF734_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String game  = sc.next();

        int winA = 0;
        for (int i = 0; i < n; i++) {
            if (game.charAt(i) == 'A') {
                winA += 1;
            } else {
                winA -= 1;
            }
        }

        if(winA == 0){
            System.out.println("Friendship");
        } else if(winA > 0){
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}

import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF112_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();

        int n = first.compareTo(second);

        if(n== 0){
            System.out.println(0);
        } else if( n > 0){
            System.out.println(1);
        } else {
            System.out.println(-1);
        }


    }
}

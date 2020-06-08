import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-05-26
 */
public class CF677_D2_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int minWidth = 0;
        for(int i=0; i< n; i++){
            int friendHeight = sc.nextInt();
            if(friendHeight > h){
                minWidth = minWidth +2;
            } else {
                minWidth = minWidth + 1;
            }
        }

        System.out.println(minWidth);
    }
}

import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF263_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get the cordinates of 1
        for(int i = 0; i<5; i++){
            for(int j =0; j< 5; j++){
                if(sc.nextInt() == 1){
                    i = i+1;
                    j = j+1;
                    int minMoves = Math.abs(j-3) + Math.abs(i-3);
                    System.out.println(minMoves);
                    break;
                }
            }
        }
    }
}

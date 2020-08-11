import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-29
 */
public class CF799_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakes = sc.nextInt(); // 8
        int ovenTime = sc.nextInt(); // 6
        int batchCake = sc.nextInt(); // 4
        int secondOven = sc.nextInt(); // 5

        int a = (cakes % batchCake) == 0 ? 0 : 1;
        int x = (cakes / batchCake) + a;
        int totalTime = x * ovenTime;

        int backedCakes = 0;
        int ovenOneTimer = 0;
        int ovenTwoTimer = -1 * secondOven;
        int time;
        for(time = 0; backedCakes < cakes; time++){

            ovenOneTimer ++;
            ovenTwoTimer++;

//            System.out.println("time "+ time + " backed cakes :"+ backedCakes);

            if(ovenOneTimer == ovenTime){
                backedCakes += batchCake;
                ovenOneTimer = 0;
            }

            if(ovenTwoTimer == ovenTime){
//                System.out.println("second oven ");
                backedCakes += batchCake;
                ovenTwoTimer = 0;
            }

        }

        if(time < totalTime){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

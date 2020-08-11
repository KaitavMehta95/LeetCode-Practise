import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kaitavmehta created on 2020-06-23
 */
public class C294_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wires = sc.nextInt();
        List<Integer> birds = new ArrayList<>();
        for (int i = 0; i < wires; i++) {
            birds.add(sc.nextInt());
        }

        int shots = sc.nextInt();
        for (int i = 0; i < shots; i++) {

            int wire = sc.nextInt() - 1;
            int num = sc.nextInt() - 1;

            int aboveWire = wire - 1;
            int downWire = wire + 1;
            int totalBirds = birds.get(wire);
            if (aboveWire != -1) {
                int add = num;
                if (add > 0) {
                    int newCount = birds.get(aboveWire) + add;
                    birds.set(aboveWire, newCount);
                }
            }

            if (downWire < wires) {
                int add = totalBirds - (num + 1);
                if (add > 0) {
                    int newCount = birds.get(downWire) + add;
                    birds.set(downWire, newCount);
                }
            }

            birds.set(wire, 0);

            }
        for(int i: birds) {
            System.out.println(i);
        }
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF59_D2_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        // count word length
        // count uppercase letter
        int total = word.length();
        int countUpperCase = 0;
        for (Character c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countUpperCase += 1;
            }
        }
        int lowercase = total - countUpperCase;
        if(countUpperCase > lowercase){
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }


    }
}

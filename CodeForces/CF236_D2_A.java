import java.util.*;

/**
 * @author kaitavmehta created on 2020-06-08
 */
public class CF236_D2_A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String userName = sc.next();

        Set<Character> uniqueChar = new HashSet<>();
        for(Character c: userName.toCharArray()){
            uniqueChar.add(c);
        }

        if(uniqueChar.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }


    }
}

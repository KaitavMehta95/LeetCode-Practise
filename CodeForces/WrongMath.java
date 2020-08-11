/**
 * @author kaitavmehta created on 2020-08-11
 */

import java.lang.reflect.Field;

public class WrongMath {
    public static void main(String[] args) throws Exception {

        weirdMath();
        System.out.printf("%d", 2 + 2);


    }









































    public  static void weirdMath() throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true); // set right to access the cache
        // Integer object reuses the cache for the int values in range of -127 to 128
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133]; // substitute 5 to 4 in the cache
    }
}

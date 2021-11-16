import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang.ArrayUtils;


class Test2 {  
    public static void main(String args[])  {    

        int[] nums = {1, 4, 7, 5, 7};
        int x = 4;
        List<Integer> result = new ArrayList<Integer>();

        for (int i : nums) {
            int count = 0;

            for (int j : nums) {
                int hasil = i / j;
                if(hasil == x) {
                    break;
                }
                count = count + 1;
                if (count == nums.length) {
                    result.add(i);
                }
            }
        }
        
        //Print the final result in a form of array of integers
        System.out.println(Arrays.toString(result.toArray()));
    }
}
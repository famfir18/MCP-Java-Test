import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



class Test1 {  
    public static void main(String args[])  {    

        int[] nums = {4,-6,-2,1};
        List<Integer> result = new ArrayList<Integer>();

        for (int i : nums) {
            int count = 0;
            for (int element2 : nums) {

                int hasil = i - element2;
                if(hasil < 0) {
                    break;
                }
                count = count + 1;
                if (count == nums.length) {
                    result.add(i);
                    Integer[] results = new Integer[result.size()]; 
                    result.toArray(results);

                    //Print the final result in a form of array of integers
                    System.out.println(Arrays.toString(results));
                }
            }
        }
    }
}
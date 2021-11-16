import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang.ArrayUtils;


class Test3 {  
    public static void main(String args[])  {

        int x = 6;
        String word ="Kami percaya efisiensi dan kemudahan proses pembayaran bagi pelanggan adalah faktor penting pendorong kemajuan bisnis anda";  
        String[] words = word.split("\\s");
        List<String> finalWords = new ArrayList<String>();

        for (String word2 : words) {
            int countChar = word2.length();

            if (countChar == x) {
                finalWords.add(word2);
            }
        }

        //Print the final result in a form of array of Strings
        System.out.println(Arrays.toString(finalWords.toArray()));
    }
}
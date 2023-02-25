import java.util.List;
import java.util.Arrays;
import java.util.Collections;
/**
 * prog9
 */
public class prog9 {
    public static void main(String[] args){
        int count = 0; 
        Integer[] arr = {1,5,9,4,12,99};
        List<Integer> my_list = Arrays.asList(arr);
        int max_number = Collections.max(my_list);
        int min_number = Collections.min(my_list);
        System.out.println(max_number);
        System.out.println(min_number);
        for (int i = 0; i < my_list.size(); i++) {
            count = count + my_list.get(i);
        }
        int sa = count / my_list.size();
        System.out.println(sa);
    }
}
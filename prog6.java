import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigInteger;
/**
 * prog6
 */
 
public class prog6 {
    public static void main(String[] args) {
        Integer[] arr= {9,1,4,3,7,4,2,5,1};
        boolean s = false;
        int max;
        while(!s) {
            s = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    s = false;
                    max = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = max;  
            }
            } 
            }
            int integer;
            List<Integer> my_list = new ArrayList<>(Arrays.asList(arr));
            for (int j = 0; j < my_list.size(); j++) {
                integer = my_list.get(j);
                BigInteger bigInteger = BigInteger.valueOf(integer);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
                System.out.println(probablePrime);
                if (probablePrime == false){
                    my_list.removeAll(Arrays.asList(integer));
                    my_list.remove(1);
            }
             }
            System.out.println(my_list);   
        }
    }
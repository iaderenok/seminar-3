import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class prog8 {

    public static void main(String[] args) {
        List<Integer> my_list= new ArrayList<Integer>();

        my_list.add(1);
        my_list.add(2);
        my_list.add(3);
        my_list.add(4);
        my_list.add(3);
        my_list.add(6);

        Iterator<Integer> i = my_list.iterator();
        while(i.hasNext()){
            Integer number= i.next();
            if(number % 2 ==0){
                i.remove();
            }
        }
        System.out.println(my_list);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kevin on 12/15/13.
 */
public class Sorting {
    public static void main(String[] agrs) {
        System.out.println("Sorting");
        Random randon = new Random();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(randon.nextInt(10000));
        }
        Sort sort = new Sort();
        System.out.println(numbers);
        numbers = sort.mergeSort(numbers);
        System.out.println(numbers);
    }

}

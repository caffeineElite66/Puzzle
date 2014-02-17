import java.util.ArrayList;
import java.util.List;

public class Sort {
    public List<Integer> mergeSort(List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }

        List<Integer> left = numbers.subList(0, numbers.size() / 2);
        List<Integer> right = numbers.subList(numbers.size() / 2, numbers.size() - 1);

        List<Integer> left2 = mergeSort(left);
        List<Integer> right2 = mergeSort(right);

        numbers = merge(left2, right2);
        return numbers;
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<Integer>();

        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) <= right.get(0)) {
                result.add(left.get(0));
                left.remove(0);
            } else {
                result.add(right.get(0));
                right.remove(0);
            }
        }

        return result;
    }
}
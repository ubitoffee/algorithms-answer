import java.util.List;
import java.util.ArrayList;

public class InterestingDigits {
    public int[] digits(int base) {
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 2; i < base; i++) {
            if ((base - 1) % i == 0) {
                result.add(i);
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}

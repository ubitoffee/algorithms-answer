import java.util.Arrays;

public class Cryptography {
    public long encrypt(int[] numbers) {
        Arrays.sort(numbers);
        numbers[0]++;
        long result = 1;
        
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        
        return result;
    }
}

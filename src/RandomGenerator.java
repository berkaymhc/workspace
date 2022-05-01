import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        int [] numbers;
        numbers = new int [11];
        Random rand = new Random();
        int low = 0;
        int high = 100;
        for (int i = 1; i < 11; i++) {
            numbers[i] = rand.nextInt(high - low) + low;}{
            Arrays.sort(numbers);
            for(int j =0;j<numbers.length;j++){
            System.out.println(j + ". eleman = " + numbers[j]);
        }
    }}}

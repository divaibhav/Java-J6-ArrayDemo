import java.util.Arrays;

public class ArrayMidReversal {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        int midPoint = (numbers.length - 1) / 2;

        for (int i = 0; i < midPoint / 2; i++) {
            // swapping
            int temp = numbers[i];
            numbers[i] = numbers[midPoint - i];
            numbers[midPoint - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

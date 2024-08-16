import java.util.Arrays;

public class BinaryArray {
    public static void main(String[] args) {
        int[] binaryArray = new int[100];

        for (int i = 0; i < binaryArray.length; i++) {
            if (i % 2 == 0) {
                binaryArray[i] = 1;
            }
        }
        System.out.println("Arrays.toString(binaryArray) = " + Arrays.toString(binaryArray));
    }
}

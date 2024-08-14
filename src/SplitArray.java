import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    /*
    WAP to accept elements of array from user.
     Convert this array into two array of odd and even elements.

     WAP to create an array containing numbers from 1 to 100.
     Convert this array into two array of odd and even elements.
     */
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println("Enter an integer value");
            // numbers[i] = keyboard.nextInt();
            if (i % 5 != 0 || i == 0) {
                numbers[i] = (i + 1) * 5;
            }
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        //create new arrays to store even and odd values
        int[] oddArray = new int[oddCount];
        int[] evenArray = new int[evenCount];
        int indexOfOddArray = 0;
        int indexOfEvenArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray[indexOfEvenArray] = numbers[i];
                indexOfEvenArray++;
            } else {
                oddArray[indexOfOddArray] = numbers[i];
                indexOfOddArray++;
            }
        }
        // to print an array we need to run for loop, but we can use Arrays class
        // and the method of that class
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(evenArray) = " + Arrays.toString(evenArray));
        System.out.println("Arrays.toString(oddArray) = " + Arrays.toString(oddArray));
    }

}

import java.util.Scanner;

public class ArrayPracticeQuestion {
    /*
    1.WAP to accept elements of array from user. Calculate and print the sum and
     average of the elements.
     write the program not th question

     3.WAP to accept elements of array from user.
     Convert this array into two array of odd and even elements.

     2.WAP to search for given element in array (create and initialize array),
     if found print the index,
      otherwise print -1
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" Enter an integer");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum = " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("average = " + average);
        System.out.println("Cheen Tapak Dam Dam");
    }
}

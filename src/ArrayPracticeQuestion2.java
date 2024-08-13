import java.util.Scanner;

public class ArrayPracticeQuestion2 {
    public static void main(String[] args) {
        /*
        2.WAP to  linear search for given element in array (create and initialize array),
     if found print the index,
      otherwise print -1

       arr = 1,2,5,9,3
       searchElement = 5

         */
        Scanner scanner = new Scanner(System.in);
        int[] arr = {7, 5, 89, 75, 1};
        System.out.println("enter element to search in the array");
        int searchElement = scanner.nextInt();
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("index = " + i);
                isFound = true;
                break;
            }


        }
        if (!isFound) {
            System.out.println("index = -1");
        }
    }
}

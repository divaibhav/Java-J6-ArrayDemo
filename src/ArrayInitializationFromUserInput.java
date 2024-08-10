import java.util.Scanner;

public class ArrayInitializationFromUserInput {
    public static void main(String[] args) {
        int size = 5;
        int[] marks = new int[size];


        Scanner scanner = new Scanner(System.in);
        // input from user
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter marks");
            marks[i] = scanner.nextInt();
        }
        // input from user


        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i != marks.length - 1) {
                System.out.print(", ");
            }
        }
        // printing array
        System.out.println();


        //process
        // print only the marks in which student is failed, passing marks 35
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println(marks[i]);
            }
        }
        // count in how many subjects student is failed
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                count++;
            }
        }
        System.out.println("count = " + count);
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("totalMarks = " + totalMarks);

        double average = totalMarks / (double) marks.length;
        System.out.println("average = " + average);

    }
    // calculate total marks

}

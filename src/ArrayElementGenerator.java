import java.util.Random;

public class ArrayElementGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("{");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(random.nextInt(1, 10000));
            if (i != 1000) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}

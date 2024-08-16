public class ArrayMaxCount {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 1, 2, 3, 4, 5, 6, 1, 2, 1, 3, 3, 6, 8, 7, 3, 1, 1, 3, 2, 1, 3, 1, 2, 2, 2, 3};
        //int count = 0;
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                System.out.println("maxCount changed");
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }
        }
        System.out.println("maxCount = " + maxCount);


    }
}

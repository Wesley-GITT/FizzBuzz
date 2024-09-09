public class Multiples {

    private static int count = 0; // starting from 0

    public static void main(String[] args) {
        calculateUsingLoop();
        System.out.println(count);
    }

    private static void calculateUsingLoop() {
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += 1;
            }
        }
    }
}

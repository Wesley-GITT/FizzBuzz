public class Multiples {

    public static int main() {
        return multiples(1000, 3, 5);
    }

    public static int main(int limit, int divisor1, int divisor2) {
        return multiples(limit, divisor1, divisor2);
    }

    private static int multiples(int limit, int divisor1, int divisor2) {
        int count = 0;
        for (int i = 1; i < limit; i++) {
            if (i % divisor1 == 0 || i % divisor2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}

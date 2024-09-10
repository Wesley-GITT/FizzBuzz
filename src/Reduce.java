public class Reduce {

    public static int main() {
        return reduce(100, 0);
    }

    public static int main(int n) {
        return reduce(n, 0);
    }

    private static int reduce(int n, int step) {
        if (n == 0) {
            return step;
        }

        if (n % 2 == 0) {
            n /= 2;
            return reduce(n, step + 1);
        } else {
            n -= 1;
            return reduce(n, step + 1);
        }
    }
}

public class Reduce {

    private static int steps = 0;

    public static void main(String[] args) {
        reduce(100);
        System.out.println(steps);
    }

    private static void reduce(int n) {
        if (n == 0) {
            return;
        } else if (n % 2 == 0) {
            n /= 2;
            steps++;
            reduce(n);
        } else {
            n -= 1;
            steps++;
            reduce(n);
        }
    }
}

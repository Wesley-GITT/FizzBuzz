/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int x = 1;
        while (x < 100) {
            extracted(x);
            x++;
        }

        for (int i = 1; i < 100; i++) {
            // extracted(i);
        }
    }

    private static void extracted(int x) {
        boolean divisibleBy3 = x % 3 == 0;
        boolean divisibleBy5 = x % 5 == 0;
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if(divisibleBy3) {
            System.out.println("Fizz");
        } else if(divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(x);
        }
    }
}

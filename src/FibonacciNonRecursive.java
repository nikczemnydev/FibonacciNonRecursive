public class FibonacciNonRecursive {
    public static void main(String[] args) {
        int nthPos = 20;
        long a = 0;
        long b = 1;

        System.out.println("Fibonacci Sequence up to " + nthPos + " position:");
        System.out.print(a + " " + b);

        for (int i = 2; i < nthPos; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
public class FibonacciNonRecursive {
    public static void main(String[] args) {
        // calculating up to a 31st position - not an accident, my recursive
        // solution used a number instead - it printed the sequence as long
        // as the numbers stayed under 1 million, that is 31 positions.  : )
        int nthPos = 31;
        // initializing a and b with first 2 numbers of the sequence: 0 and 1
        long a = 0;
        long b = 1;

        System.out.println("Fibonacci Sequence up to " + nthPos + " position:");
        System.out.print(a + ", " + b);
        // loop iterates from 2 to the value of nthPos, calculating and
        // printing each number. a b and c are updated iteratively avoiding
        // recursion
        for (int i = 2; i < nthPos; i++) {
            long c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
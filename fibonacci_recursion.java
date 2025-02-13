public class fibonacci_recursion {
    void fib(int a, int b) {
        if (a <= 100) {
            System.out.println(a);
            fib(b, a + b);
        }
    }

    public static void main(String[] args) {
        int a = 0, b = 1;

        fibonacci_recursion obj = new fibonacci_recursion();

        obj.fib(a, b);
    }
}
public class methods_in_java {

    int sum(int x, int y) {
        return x + y;
    }

    int sum(int x, int y, int z) {
        
        return x + y + z;
    }

    int Sum(int... x) { // ... operator is used to represent the VarArg. It is available as in Array.

        // Here x is available as int [] x;
        
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        
        return sum;
    }

    void print(int x, double y, String... z) {              // Functions can have normal arguments also with VarArgs, but then VarArgs are to be passed a the last
        System.out.println(x);
        System.out.println(y);

        for (String i : z) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 2;

        methods_in_java obj = new methods_in_java();

        // System.out.println(obj.sum(a, b));
        // System.out.println(obj.sum(a, b, c));

        /*
         * If we keep on increasing the no. of parameters passed to the function, we
         * need to write more overloaded functions for each call.
         * This is not practical, so we use the concept of VAR-ARGS. In VarArgs, we can
         * pass any no. of arguments to a function.
         */

        System.out.println(obj.Sum(1, 2, 4, 55, 65, 63, 74, 21, 87, 38));

        // obj.print(1, 4.86554464, "Aryan", "Gupta", "Hello", "Everybody");               // VarArgs are to be passed at last.


    }
}
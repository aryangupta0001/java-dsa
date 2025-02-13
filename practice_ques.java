public class practice_ques {

    int sum_nat_num(int n) {
        if (n > 0)
            return n + sum_nat_num(n - 1);
        
            return n;

    }

    public static void main(String[] args) {

        practice_ques obj = new practice_ques();

        /* Q. Sum of N natural number using recursion */
        int n = 15;
        System.out.println(obj.sum_nat_num(n));
    }
}

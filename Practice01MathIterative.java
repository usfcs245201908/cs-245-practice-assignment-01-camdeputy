public class Practice01MathIterative implements Practice01Math {

    public int fact(int n) throws Exception {
        if(n <= 0)
            throw new IllegalArgumentException("Only positive numbers allowed");
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public int fib(int n) throws Exception {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int x = 0;
        int y = 1;
        int val = 1;
        for(int i = 2; i <= n; i++) {
            val = x + y;
            x = y;
            y = val;
        }
        return val;
    }
}

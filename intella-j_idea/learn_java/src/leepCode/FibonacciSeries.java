package leepCode;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n){
        int prev = 0, next = 1,
                fibbon = prev + next;

        if (n == 0) {
            return prev;
        } else if (n == 1 ){
            return next;
        } else {
            prev = next;
            next = fibbon;
            for ( int i = 2 ; i < n; i++){
                fibbon = prev + next;
                prev = next;
                next = fibbon;
            }
            return fibbon;
        }
    }
}

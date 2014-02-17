/**
 * Created by kevin on 12/9/13.
 */
public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(10));
        System.out.println(fact(5));
    }

    public static int fibo(int level) {
        if (level == 0 || level == 1) {
            return level;
        } else {
            return fibo(level -1) + fibo(level -2);
        }
    }

    public static int fact(int level) {
        System.out.print(level + " * ");
        if (level == 1) {
            return 1;
        } else {
            return fact(level - 1) * level;
        }
    }
}


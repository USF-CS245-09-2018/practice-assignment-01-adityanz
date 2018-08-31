//package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int thecurrentno = 1;
            int thepreviousnumber = 1;

            for (int i = 2; i < n; i++) {
                int temp = thecurrentno;
                thecurrentno += thepreviousnumber;
                thepreviousnumber = temp;
            }
            return thecurrentno;
        }
    }
}

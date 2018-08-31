//package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial {
    @Override
    public int factorial(int n) {
        int temporary = n;
        for (int i = n-1; i > 0; i--)
        {
            temporary = temporary * i;
        }
        return temporary;
    }
}

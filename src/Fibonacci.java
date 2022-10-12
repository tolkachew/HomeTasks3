class Fibonacci {
    public static void main(String[] args) {
        int n = 10_000_000, f1 = 0, f2 = 1;
        System.out.print("Fibonacci numbers from 0 to " + n + ": ");
        while (f1 <= n) {
            System.out.print(f1 +" ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

        }
    }
}
/*
Task 1
Fibonacci numbers are a sequence of numbers, in which the first
two numbers of the sequence are 0 and 1, and each successive
number is equal to the sum of two preceding ones.
Output all Fibonacci numbers in the range from 0 to 10,000,000
to the screen.
 */
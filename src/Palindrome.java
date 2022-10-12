import java.util.Scanner;

class Palindrome {
    public static boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return (num == rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
/*
Task 5
Write a program that will check whether the number entered
from the keyboard is a palindrome (equally readable in both
directions). For example, 123454321 or 221122 is a palindrome.
The program should output YES if the number is a palindrome,
otherwise NO.
 */
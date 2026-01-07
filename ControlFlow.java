import java.util.Scanner;

public class ControlFlow {


    //static method
    public static int sum(int a, int b) {
        return a + b;
    }

    /*
    This static method is from my analysis of algorithms
    course, how exponentiation is written in code, with a
    divide and conquer method (which is better than naive way
    because the time complexity is O(logn) instead of O(n)).
     */
    public static int power(int x, int n) {
    if (n == 0) return 1;

    int half = power(x, n / 2);

    if (n % 2 == 0) {
        return half * half;
    } else {
        return x * half * half;
    }
} 
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Print demo");

        int m = sum(3, 4);
        System.out.println("sum(3,4) = " + m);

        System.out.println("enter x in x^n");
        int x = scan.nextInt();
        System.out.println("enter n in x^n");
        int n = scan.nextInt();
        int p = power(x, n);
        System.out.println("power(" + x + ", " + n + ") = " + p);
        scan.close();
    }
}

/* 
/// -methods are used to reuse logic, encapsulate behavior (hide how somethings done), test in isolation
/// They are like <modifiers> <returnType> <name> (<params>) [throws] {body}
/// Use public/private/protected for access, static or final, void or int or String (if nothing returned)
/// The name is what you call and throws declare checked exceptions
*/
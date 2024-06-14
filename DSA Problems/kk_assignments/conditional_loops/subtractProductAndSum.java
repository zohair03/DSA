
public class subtractProductAndSum {
    // this is a leetcode problem:

    // ==> Given an integer number n, return the difference between the product of
    // its digits and the sum of its digits.

    // Input:n=234 Output:15
    // Explanation:
    // Product of digits=2*3*4=24
    // Sum of digits=2+3+4=9
    // Result=24-9=15

    static int spands(int n) {
        int pod = 1;
        int sod = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            pod = pod * lastdigit;
            sod = sod + lastdigit;
            n = n / 10;
        }
        int diff = pod - sod;
        
        return diff;
    }

    public static void main(String[] args) {
        int number = 234;
        int result = spands(number);
        System.out.print(result);
    }

}

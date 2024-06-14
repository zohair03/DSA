import java.util.*;

public class largest_number {
    public static int largest(int n[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
            if (n[i] < smallest) {
                smallest = n[i];
            }
        }
        System.out.println(smallest + " is smallest number");
        return largest;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, -4, 6, 3, 0, 13, 5, 7 };
        System.out.println(largest(n) + " is largest number");
    }
}

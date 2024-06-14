

public class Reverse {
    public static void main(String[] args) {
        int n = 23597;

        int ans = 0;
        while (n>0){
            int lastdigit = n%10;
            ans = (ans*10) + lastdigit;
            n=n/10; // To break the number(variable:n)
        }
        System.out.println(ans);
    }
}


public class CountNums {
    public static void main(String[] args) {
      int n = 13839;

      int repeations = 0;

      while(n>0){
          int lastdigit = n%10; // Last Digit
          if (lastdigit == 3){
              repeations++;
          }
          n=n/10;
      }
        System.out.println(repeations);
    }
}

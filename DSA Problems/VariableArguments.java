
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(12,3,4, 5, 6, 7, 8);
    }
    static void fun(int a, int b,int ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}

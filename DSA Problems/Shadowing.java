

public class Shadowing {

    static int x = 90; // this will be shadowed at line 8;

    public static void main(String[] args) {
        System.out.println(x); // x:90
        int x = 40;
        System.out.println(x); // x:40
        fun();
    }

    static void fun(){
        System.out.println(x); // since this is outside of scope int x = 40 , will print x:90
    }
}

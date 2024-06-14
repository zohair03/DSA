

public class FunctionOverloading {
    public static void main(String[] args) {

        // Function/Method Overloading is in compile time;

        fun(56);
        fun("zohair");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

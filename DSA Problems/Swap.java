

public class Swap {
    public static void main(String[] args) {


    /* In Java, we pass by Value
    *
    *  Primitives: int, short,char,byte,... are just passing value
    *
    *  objects and stuff: passing value of the  refarance variable
    *
    *
    * */


        int a = 10;
        int b = 20;

        swap(a,b); // this will not swap the value cuz this is pass by value not pass by reference;

        System.out.println(a+" "+b);
    }

    static void swap( int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

}

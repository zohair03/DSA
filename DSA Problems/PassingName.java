

public class PassingName {

    /* In Java, we pass by Value
     *
     *  Primitives: int, short,char,byte,... are just passing value
     *
     *  objects and stuff: passing value of the  refarance variable
     *
     *
     * */


    public static void main(String[] args) {
        String name = "kunal";
        change(name);
        System.out.println();
    }

    static void change(String naam) {
        naam = "rahul"; // here we are creating a new object in heap memory & also Strings are immortable;
    }

}

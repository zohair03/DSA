
// import java.util.Objects;
import java.util.Scanner;

public class data_types {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String datatype = sc.nextLine();

        String bytes = dataTypes(datatype);
        System.out.println(bytes);
    }

    public static String dataTypes(String type) {
        // Write your code here

        if (type.equals("Integer")) {
            return 4;
        } else if (type.equals("Long")) {
            return 8;
        } else if (type.equals("Float")) {
            return 4;
        } else if (type.equals("Double")) {
            return 8;
        } else if (type.equals("Character")) {
            return 1;
        } else {
            return 0;
        }
    }
}

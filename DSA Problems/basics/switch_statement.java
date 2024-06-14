import java.util.Scanner;


public class switch_statement {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area = 0;
        switch (ch) {
            case 1:
                area = Math.PI * (a[0] * a[0]);
                break;
            case 2:
                area = a[0] * a[1];
                break;
            default:
                area = 0;
                break;
        }

        return area;


        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double[] arry = new double[2];
        arry[0] = sc.nextDouble();
        arry[1] = sc.nextDouble();
        double areas = areaSwitchCase(choice, arry);
        System.out.println(areas);
    }
}
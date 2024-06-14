
import java.util.Scanner;

public class hcf_and_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("num1:");
        int n1= sc.nextInt();

        System.out.println("num2:");
        int n2= sc.nextInt();


        // for lcm only:
//        int lcm = (n1>n2) ? n1 : n2;  //largest number
//
//        while(true){
//
//            if (lcm % n1==0 && lcm % n2==0) {
//                System.out.println(lcm);
//                break;
//            }
//            lcm++;
//        }
        
        int hcf = 1;

        for (int i = 1; i <= n1; i++) {
            if (n1%i==0 && n2%i==0){
                hcf = i;
            }
        }

        int lcm = (n1*n2)/hcf;

        System.out.println("HCF:"+hcf);
        System.out.println("LCM:"+lcm);
    }
}

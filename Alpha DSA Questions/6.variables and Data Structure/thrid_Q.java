import java.util.Scanner;

public class thrid_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        float gst_amount = ((total * 18) / 100);
        float net_value = total + gst_amount;

        System.out.println(net_value);
    }
}

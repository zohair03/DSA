
public class even_days {
    public static void main(String[] args) {
        // Kunal is allowed to go out with his friends only on the even days of a given
        // month. Write a program to count the number of days he can go out in the month
        // of August.

        int can_go_out = 0;

        for(int num_of_days = 1; num_of_days <= 31; num_of_days++){
            if (num_of_days % 2 == 0) {
                can_go_out++;
            }
        }

        System.out.println(can_go_out);
    }
}

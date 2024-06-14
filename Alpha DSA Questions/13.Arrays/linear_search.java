public class linear_search {
    public static int find(int n[], int key) {

        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 2;

        if (find(n, key) >= 0) {
            System.out.println("number is at " + find(n, key) + "th position");

        }else{
            System.out.println("oops your number "+key+" is not in the list");
        }
    }
}

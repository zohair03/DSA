public class arrays_as_arguments {

    public static void update(int marks[]){

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.print(marks[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int marks[] = {99,98,97,94};
        update(marks);
       
    }
}

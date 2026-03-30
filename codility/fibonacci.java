public class fibonacci {
    public static void main(String args[]) {
        int range = 60;
        double first = 0;
        double second = 1;

        int index = 0;
        double sum = 0;

        System.out.println(first + ", " + second + ", ");

        while (index < range){
            sum = second  + first;
            first = second;
            second = sum;

            index = index + 1;

            System.out.println(sum + ", ");
        }
    }
}

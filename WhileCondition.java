public class WhileExample {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Number: " + i);
            i++; // increment to avoid infinite loop
        }
    }
}

import java.util.*;

public class IfCondition {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shoe size:");
        int shoeSize = sc.nextInt();

        if (shoeSize==25) {
            System.out.println("The shoe size is correct");
        } else {
            System.out.println("The shoe size is wrong");
        }
    }
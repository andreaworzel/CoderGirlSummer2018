import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.println();
        out.println("How large would you like to see them? ");
        int size = keyboard.nextInt();

        for (int counter = 0; counter <= size; counter++){
            for (int count = 0; count <= size; count++){
                out.println(counter + " * " + count + " = " + (counter * count));
            }
        }
    }

}

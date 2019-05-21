import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        if(name.equalsIgnoreCase("alice")||name.equalsIgnoreCase("bob")){
            System.out.println("Hello!");
    }
    }
}


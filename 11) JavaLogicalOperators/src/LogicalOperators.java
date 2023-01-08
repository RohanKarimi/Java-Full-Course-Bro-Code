import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Logical operators = used to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (OR) either condition must be true
        //      !  = (NOT) reverses boolean value of a condition

        // int temp = 25;

        // if(temp > 30){
        //     System.out.println("It is hot outside");
        // }else if(temp >= 20 && temp <= 30){
        //     System.out.println("It is warm outside");
        // }else{
        //     System.out.println("It is cold");
        // }

        System.out.println("You are playing a game! press q or Q to quit");
        String response = scan.nextLine();

        if(response.equals("Q") || response.equals("q")){
            System.out.println("You quit the game");
        }else{
            System.out.println("You are still playing the game *pew pew* ");
        }

        scan.close();
    }
    
}

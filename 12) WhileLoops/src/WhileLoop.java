import java.util.Scanner;


public class WhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // while loop = executes a block of code as long as it´s condition remains true
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name");
            name = scan.nextLine();
        }
        System.out.println("Hello "+ name);


        // do{
        //     System.out.println("Enter your name: ");
        //     name = scan.nextLine();
        // }while(name.isBlank());

        // System.out.println("Hello "+ name);

        scan.close();
    }
    
}

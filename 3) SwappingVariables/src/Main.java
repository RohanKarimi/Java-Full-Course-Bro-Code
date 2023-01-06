public class Main{

    public static void main(String[] args) {
        
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("The value of X = "+x);
        System.out.println("The value of y = "+ y);
    }
}
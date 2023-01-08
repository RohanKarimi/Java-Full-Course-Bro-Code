public class JavaMethods {

    public static void main(String[] args) {
        
        // method =  a block of code that is executed whenever it is called upon
        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.out.println(z);
        System.out.println(add(x, y));


        String name = "Bro";
        int age = 21;

        hello(name, age);


    }

    static int add(int x, int y){

        int sum = x + y;
        return sum;
        // return x + y;
    }

    static void hello(String name, int age){
        System.out.println("Hello "+ name);
        System.out.println("You are "+age);
    }
    
}

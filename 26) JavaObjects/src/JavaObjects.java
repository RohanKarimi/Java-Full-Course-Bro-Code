public class JavaObjects {
    
    // object = an instance of a class that may contain attributes and methods
    // example: (phone, desk, computer, cup)...

    public static void main(String[] args) {
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println();

        myCar1.drive();
        myCar1.brake();
        System.out.println();

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        
    }
}

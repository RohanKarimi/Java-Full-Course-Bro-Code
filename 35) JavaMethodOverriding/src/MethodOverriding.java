public class MethodOverriding {
    
    public static void main(String[] args) {
        
        // method overriding = Declaring a method in a subclass, which is already present in a parent class.
        //                     done so that a child class can give its own implementation

        Animal animal = new Animal();
        animal.speak();
        
        Dog dog = new Dog();
        dog.speak();
    }
}

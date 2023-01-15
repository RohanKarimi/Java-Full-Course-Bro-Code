public class Encapsulation {
    
    public static void main(String[] args) {
        
        // Encapsulation = attributes of a class will be hidden or private
        //                 Can be acessed only through methods(getters & setters)
        //                 You should make attributes private if you don´t have a reason to make them public/protected

        Car car = new Car("Chevrolet", "Camaro", 2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}

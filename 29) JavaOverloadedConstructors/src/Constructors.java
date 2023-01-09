public class Constructors {

    public static void main(String[] args) {
        
        // overloaded constructors = multiple constructors within a class with the same name, but have different parameters

        Pizza pizza = new Pizza("Thicc crust", "Tomato", "Mozzarella", "Pepperoni");

        System.out.println("Here are the ingredientes of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
    
}

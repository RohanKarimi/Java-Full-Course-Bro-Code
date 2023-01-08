import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        
        // ArrayList = a resizable array.
        //             Elements can be added and removed after compilation phase
        //             can only store reference data types
    
        ArrayList <String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");

        food.set(0, "sushi");  //replacing value at index 0 for sushi
        food.remove(2);  //removing element at index 2
        // food.clear();  removing all elements of arraylist

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }        
    }
    
}

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {
        
        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible


        ArrayList<String> animalsList = new ArrayList<>();
        animalsList.add("bird");
        animalsList.add("rat");
        animalsList.add("dog");
        animalsList.add("cat");

        for(String i : animalsList){   // for every string "i" in our arrayList(animalsList)
            System.out.println(i);
        }


        String[] animals = {"cat", "dog","rat", "bird"};
        for(String i : animals){   // for every string "i" in our array(animals)
            System.out.println(i);
        }
    }
    
}

public class SuperKeyword {
    
    public static void main(String[] args) {
        
        // super = keyword refers the superclass(parent) of an object
        //         very similar to the "this" keyword.

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "Everything");

        System.out.println(hero2.toString());

       
    }
}

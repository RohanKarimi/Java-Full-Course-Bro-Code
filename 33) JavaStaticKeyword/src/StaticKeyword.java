public class StaticKeyword {

    public static void main(String[] args) {
        
        // static = modifier. A single copy of a variable/method is created and shared.
        //          the class "owns" the static member

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
        
    }
    
}

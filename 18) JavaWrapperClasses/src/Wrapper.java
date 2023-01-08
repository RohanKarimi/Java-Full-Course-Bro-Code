public class Wrapper {

    public static void main(String[] args) {
        
        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference dara types contain useful methods
        //                 can be used with collections (ex: Arraylist)
        
        
        // primitive        wrapper
        //---------         -------
        // boolean         Boolean
        // char            Character
        // int             Integer
        // double          Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types
        //              and their corresponding object wrapper classes.

        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // When we directly assign some values to each of these reference data types, what we have done is autoboxing: We automaticaly
        // converted these primitive values to their corresponding wrapper class.

        if(b == '@'){
            System.out.println("This is true");
        }

        // variable b behaves like a normal primitive boolean (unboxing). You can still treat these wrapper as primitives.

        
    }
    
}

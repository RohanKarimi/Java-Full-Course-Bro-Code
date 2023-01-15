package package2;
import package1.*;

public class C {
    public String publicMessage = "This is public";  // visible to any package within the project folder
    protected String protectedMessage = "This is protected"; // Acessible to a different class in a different package as long as that class
    // is a subclass of whatever class contains this protected member.
              String defaultMessage = "This is the default";  // visible to same package
    private String privateMessageString = "This is private";  // visible to same class
}

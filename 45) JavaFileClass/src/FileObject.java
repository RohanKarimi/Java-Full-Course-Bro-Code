import java.io.File;

public class FileObject {
    
    public static void main(String[] args) {
        
        // file = an abstract representation of file and directory pathnames

        File file = new File("batata");

        if(file.exists()){
            System.out.println("That file exists! :O!");
        }
        else{
            System.out.println("That file does not exist");
        }

    }
}

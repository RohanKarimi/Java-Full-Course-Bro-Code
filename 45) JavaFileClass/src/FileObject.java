import java.io.File;

public class FileObject {
    
    public static void main(String[] args) {
        
        // file = an abstract representation of file and directory pathnames

        File file = new File("C:/Learning/Java-Full-Course-Bro-Code/45) JavaFileClass/src/batata.txt");

        if(file.exists()){
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        }
        else{
            System.out.println("That file does not exist");
        }

    }
}

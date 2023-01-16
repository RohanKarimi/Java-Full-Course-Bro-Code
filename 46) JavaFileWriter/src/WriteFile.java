import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    
    public static void main(String[] args) {
        
        

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

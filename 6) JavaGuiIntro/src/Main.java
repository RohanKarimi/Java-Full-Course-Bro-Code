import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your are "+height+" cm tall");

        int birthDate = 2023 - age;
        JOptionPane.showMessageDialog(null, "You were born in the year "+birthDate);

        if(height < 170){
            JOptionPane.showMessageDialog(null, "Damn, you are short :( ");
        }
        else if(height < 190){
            JOptionPane.showMessageDialog(null, "Great height! Good for you! ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Chill bro");
        }

        // the showInputDialog method is going to return a string, so we have to parse it to int
        
    }
    
}

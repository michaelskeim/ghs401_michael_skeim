import javax.swing.JOptionPane;
/**
 * Write a description of class practice1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class practice1
{
    public static void main(){
        double hrsSleep = Double.parseDouble(JOptionPane.showInputDialog("How much do you sleep (hours)"));
        while(hrsSleep < 0 ){
            System.out.println("You said " + hrsSleep + " hours." + "Thats impossible!");
            hrsSleep = Double.parseDouble(JOptionPane.showInputDialog("How much do you sleep (hours)"));
        }
        while (hrsSleep > 24){
            System.out.println("Impossible");
            hrsSleep = Double.parseDouble(JOptionPane.showInputDialog("How much do you sleep (hours)"));
        }
        
    
    }
}

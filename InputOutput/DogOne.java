import javax.swing.JOptionPane;
public class DogOne
{
    public static void main(){
        String mName;
        String mBreed;
        double w;
        
        
        mName = JOptionPane.showInputDialog("Whats your dog's name: ");
        mBreed = JOptionPane.showInputDialog("Whats your dog's breed: ");
        w = Double.parseDouble(JOptionPane.showInputDialog("Whats your dog's weight: "));
        
        Dog d1 = new Dog();
        Dog d2 = new Dog(mName,mBreed,w);
    
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        System.out.println(d1.getWeight());
    }
}

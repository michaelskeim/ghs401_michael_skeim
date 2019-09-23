import javax.swing.JOptionPane;
/**
 * Write a description of class projectFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectFive
{
    public static void main(){
        int max = 0;
        int min = 100;

        int num;
        int myArray[];
        int arLen = Integer.parseInt(JOptionPane.showInputDialog("How many integers do you want in the array"));
        while(arLen > 10000 || arLen < 10){
            arLen = Integer.parseInt(JOptionPane.showInputDialog("How many integers do you want in the array?"));
            
        }
        myArray = new int[arLen];
        for (int i = 0; i < arLen; i++){
            num = (int)(Math.random()*((19-12)+1)) + 12;
            
            
            System.out.print(num + "\t");
            
            
            
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

        }
        System.out.println("");
        System.out.println("The lowest is " + min);
        System.out.println("The greatest is " + max);
 }
}

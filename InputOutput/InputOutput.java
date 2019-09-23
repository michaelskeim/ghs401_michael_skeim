import javax.swing.JOptionPane;

public class InputOutput
{
   public static void main(){
       String name = JOptionPane.showInputDialog("What is your name?");
       int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
       
       int a = 5;
       int b = 2;
       double c=a/(double)b;
       
       System.out.println(c);
       
   
       System.out.println("Hello " + name + " you are, " + age + " years old.");
       if(age >= 16){
           System.out.println("You can drive.");
    
    }
    
    else{
        System.out.println("Go ride a bike.");
        
    }
    
    
    
}
}
import javax.swing.JOptionPane;
/**
 * Write a description of class projectThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *
public class projectThree
{
   public static void main(){
       String school = JOptionPane.showInputDialog("What school do you go to?");
       String[] people = {"Test1", "Test2", null, "Waldo"};
       String schoolA = "Granada";
       String mascotA = "Matadors";
       int counter = 0;
       String holderOne = "";
       if(school.equals(schoolA)){
           String mascot = JOptionPane.showInputDialog("What is you school's mascot?");
           if(mascot.equals(mascotA)){
               System.out.println("go mats");
               for(int i = 0; i < people.length; i++){
                   holderOne = (String)people[i];
                   int iSquare = i + 1;
                   
                   if(holderOne == null){
                       System.out.println("Element #" + iSquare + " is empty")                       
                    }
                   if(holderOne == "Waldo"){
                       counter++;
                       System.out.println("found waldo");
                    }
                    
                   else{
                       System.out.println("Element #" + iSquare + " was not Waldo");
                    
                    }
               
                }
           }
           else{
               System.out.println("Your mascot is wrong");
            }
        }
       else{
           System.out.println("Your school is WRONG");
        }
        
    
    }
}

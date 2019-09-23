import javax.swing.JOptionPane;

public class tes2
{
   public static void main(){
       String school = JOptionPane.showInputDialog("What school do you go to?");
       String[] people = {"Test1", "Test2", null, "Waldo"};
       String schoolA = "Granada";
       String mascotA = "Matadors";
       int counter = 0;
       String holderOne = "";
       String holderTwo = "";
       if(school.equals(schoolA)){
           String mascot = JOptionPane.showInputDialog("What is you school's mascot?");
           if(mascot.equals(mascotA)){
               System.out.println("go mats");
               for(int i = 0; i < people.length; i++){
                   holderOne = people[i];
                   int iSquare = i + 1;
                   
                   if(holderOne == null){
                       System.out.println("Element #" + iSquare + " is empty");                  
                    }
                   else if(holderOne.equals ("Waldo")){
                       
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
          System.out.println("Your school is incorrect");
        }
        
        
        
        
        
        String movieQ = JOptionPane.showInputDialog("Name a movie character or something.");
                       for (int w = 0; w < people.length; w++){
                           holderTwo = people[w];
                           if (movieQ.equals (holderTwo)){
                               System.out.println("we like the same thing i guess");
                            }
                        }
    }
}

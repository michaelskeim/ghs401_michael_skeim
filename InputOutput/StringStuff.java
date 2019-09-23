myArray = myArray[4];
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{
    public static void main(){
        String[] classmates = {"Michael", null, "Austin", "Greg", "Dale"};
        for(int i=0;i < classmates.length; i++){
            if(classmates[i] != null)
                System.out.println(classmates[i].length());
        }
    
    }
    
}

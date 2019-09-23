
/**
 * Write a description of class projectFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectFour
{
    public static void main(){
        int iSquare;
        int num1;
        int num2;
        int holder = 0;
        String[] testString = {"Shrek: Forever After", "The Last Airbender", "The Room"};
        String[] testString2 = {"Revenge","Down Under","Déjà Vu"};
        for(int i = 1; i < 11;i++){
            iSquare = i*i;
            num1 = (int)(Math.random()*(iSquare - i+1)+i);
            System.out.print(i + "\t" +iSquare + "\t" + num1 );
            
            if(num1 == 1){
                System.out.println("\t" + "The base and square are equal to the random number");
            
            }
            else if(num1 == iSquare){
                System.out.println("\t" + "The squared number and the random number are equal");
            
            }   
            else if(num1 == i){
                System.out.println("\t" + "The base number and the random number are equal");
            
            }   
            else{
                System.out.println("");
            }
        }
        
        for(int w = 0; w < testString.length; w++){
            System.out.println(testString[w]);
        
        
        }
        while(holder < testString2.length){
            if(holder == (testString2.length-1)){
                System.out.print(testString2[holder]);
                holder++;
            }
            else{
                System.out.print(testString2[holder] + ", ");
                holder++;
            }
           
        }
                
    }
}

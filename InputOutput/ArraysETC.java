

public class ArraysETC
{
    public static void main()
    {
        /*int[] myArray = new int[8];
        
        //System.out.println(myArray.length);
        
           for(int i=0; i <= myArray.length; i++)
        {
            myArray[i] = i*15;
            
        }
        
           for(int i=0; i <= myArray.length; i++)
        {
            System.out.println("Value is: " + myArray[i]);
            
        }
        */
       
       //random number between 90 and 100 inclusive
       int num;
       
       for(int i=0; i<30; i++){
        num = (int)(Math.random()*11) + 90;
        System.out.println(num);
        
        System.out.println("Remainder when divided by 2 is " + num%2);
        
        }
       
        
      
        
        
        
    }
}

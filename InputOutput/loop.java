import java.util.Random; 
public class loop
{
    public static void main(){
        String[] firstName = {"mike", "john","sri","zelda","bob"};
        String[] lastName = {"ross", "cates", "bing", "keller", "green"};
        int num1;
        int num2;
        
        
        System.out.println("FirstName\t\tLastName");
        for(int i = 0; i<10; i++){
            num1 = (int)(Math.random()*firstName.length);
            num2 = (int)(Math.random()*lastName.length);
            
            System.out.println(firstName[num1] + "\t\t\t" + lastName[num2]);
        }
        
        int a=0;
        int b = 4;
        while(a < firstName.length){
            /*System.out.println(a);
            a -= 1;
            */
            
            System.out.println(firstName[b]);
            b--;
            a++;
        }
    
    }
}



public class GhostDriver
{
    public static void main(){
        
        Ghost g1 = new Ghost(); 
        Ghost g2 = new Ghost();
        
        
        System.out.println(g1.toString());
        
        
        
        Ghost g3 = new Ghost("chartruse", 99, 13);
        
        
        System.out.println(g3.toString());
        
        g3.bumpSpeed(5);
        
        System.out.println(g3.toString());        
        //increase by 1
        g3.bumpSpeed();
        
        System.out.println(g3.toString());
        
        g3.doubleColor(2);
        
        System.out.println(g3.toString());
    }
}

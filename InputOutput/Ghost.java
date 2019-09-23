
public class Ghost
{
    //instance variables for the class Ghost
    private String color;
    private int speed;
    private int level;
    //zero-argument constructor, basically makes a default ghost
    public Ghost(){
        color = null;
        speed = 0;
        level = 0;
    }
    
    //two argument constructor, can set the instance variables to anything desired
    public Ghost(String c, int s, int l){
        this.color = c;
        this.speed = s;
        this.level = l;
    }
    
    public void bumpSpeed(int bump){
    
        this.speed+=bump;
    
    }
    
    public void bumpSpeed(){
    
        this.speed++;
    
    }
    
    
    public void doubleColor(int b){
        while(b>0){
            this.color = this.color + this.color;
            b--;
        }
        
    }
    public void doubleColor(){
        this.color = this.color + this.color;
        
    }
    
    
    
    //public means other classes have access to this method
    //String is the return-type of this method, it gives a String
    //toString is the name of this method
    public String toString(){
        
        return "Color: " + this.color + " Speed: " + this.speed + " Level: " + this.level; 
    
    
    }
    
    
    
}

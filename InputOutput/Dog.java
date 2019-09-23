
public class Dog
{
    private String name;
    private String breed;
    private double weight;
    
    public Dog(){
        name = null;
        breed = null;
        weight = 0.0;
    }
    
    public Dog(String mName, String mBreed, double w){
        this.name = mName;
        this.breed = mBreed;
        this.weight = w;
    
    }
    
    public double getWeight(){
        return this.weight;
    
    }
    
    public String toString(){
    
        return "Name: " + this.name + " Breed: " + this.breed + " Weight: " + this.weight;  
    }
}

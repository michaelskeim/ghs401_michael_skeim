
public class PandaDriver
{
    public static void main(){
       /*
        Panda panda1 = new Panda("China", 832.78);
        Panda panda2 = new Panda();
        
        System.out.println(panda1.toString());
        panda1.setWeight(755.11);
        panda1.setCountry("Mongolia");
        System.out.println(panda1.toString());
        System.out.println(panda1.getCountry());
        */
       
       Panda panda1 = new Panda("China", 832.56);
       double currentWeight = panda1.getWeight();
       currentWeight += 1000.0;
       panda1.setWeight(currentWeight);
       System.out.println(panda1.getWeight());
       //dataType name = new DataType
       Panda[] zoo = new Panda[3];
       zoo[0] = new Panda("USA", 311.2);
       zoo[1] = new Panda("Canada", 419.99);
       zoo[2] = new Panda("Mexico", 222.2);
       
       for(int i = 0; i < zoo.length; i++){
           System.out.println(zoo[i]);
           
       }
    }
}
